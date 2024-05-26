package com.develhope.testcontroller;

import com.develhope.testcontroller.controllers.UserController;
import com.develhope.testcontroller.dtos.UserRequestDTO;
import com.develhope.testcontroller.dtos.UserResponseDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ActiveProfiles(value = "test")
@AutoConfigureMockMvc

class UserControllerTest {

	@Autowired
	private UserController userController;

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	private UserResponseDTO createUser() throws Exception {
		UserRequestDTO userRequest = new UserRequestDTO("Sem", "Kok", "kokshse196@proton.me", "password");
		return createUser(userRequest);
	}

	private UserResponseDTO createUser(UserRequestDTO userRequest) throws Exception {
		MvcResult result = createUserRequest(userRequest);
		UserResponseDTO createdUser = objectMapper.readValue(result.getResponse().getContentAsString(), UserResponseDTO.class);
		assertThat(createdUser.getId()).isNotNull();
		return createdUser;
	}

	private MvcResult createUserRequest() throws Exception {
		UserRequestDTO userRequest = new UserRequestDTO("Request", "User", "request.user@example.com", "password");
		return createUserRequest(userRequest);
	}

	private MvcResult createUserRequest(UserRequestDTO userRequest) throws Exception {
		if (userRequest == null) {
			return null;
		}
		String userJson = objectMapper.writeValueAsString(userRequest);

		return this.mockMvc
				.perform(post("/api/v1/users")
						.contentType(MediaType.APPLICATION_JSON)
						.content(userJson))
				.andDo(print())
				.andExpect(status().isOk())
				.andReturn();
	}

	@Test
	void userControllerLoads() {
		assertThat(userController).isNotNull();
	}

	@Test
	void createUserTest() throws Exception {
		UserResponseDTO createdUser = createUser();
		assertThat(createdUser.getId()).isNotNull();
	}

	@Test
	void getAllUsersTest() throws Exception {
		createUser();
		createUser();
		createUser();
		createUser();

		MvcResult result = this.mockMvc
				.perform(get("/api/v1/users"))
				.andDo(print())
				.andExpect(status().isOk())
				.andReturn();

		List<UserResponseDTO> allUsers = objectMapper.readValue(result.getResponse().getContentAsString(), List.class);
		System.out.println("Users in DB: " + allUsers);
		assertThat(allUsers.size()).isNotZero();
	}

	@Test
	void getUserByIdTest() throws Exception {
		UserResponseDTO user = createUser();

		assertThat(user.getId()).isNotNull();
		MvcResult result = this.mockMvc
				.perform(get("/api/v1/users/" + user.getId()))
				.andDo(print())
				.andExpect(status().isOk())
				.andReturn();

		UserResponseDTO userFound = objectMapper.readValue(result.getResponse().getContentAsString(), UserResponseDTO.class);
		System.out.println("User in DB: " + userFound);
		assertThat(userFound.getId()).isEqualTo(user.getId());
	}

	@Test
	void updateUserTest() throws Exception {
		UserResponseDTO user = createUser();
		assertThat(user.getId()).isNotNull();

		UserRequestDTO updatedRequest = new UserRequestDTO("Updated", "User", "updated@mail.com", "updatedpassword");
		String userJson = objectMapper.writeValueAsString(updatedRequest);

		MvcResult result = this.mockMvc
				.perform(put("/api/v1/users/" + user.getId())
						.contentType(MediaType.APPLICATION_JSON)
						.content(userJson))
				.andDo(print())
				.andExpect(status().isOk())
				.andReturn();

		UserResponseDTO updatedUser = objectMapper.readValue(result.getResponse().getContentAsString(), UserResponseDTO.class);
		assertThat(updatedUser.getId()).isEqualTo(user.getId());
		assertThat(updatedUser.getName()).isEqualTo(updatedRequest.getName());
		assertThat(updatedUser.getSurname()).isEqualTo(updatedRequest.getSurname());
		assertThat(updatedUser.getEmail()).isEqualTo(updatedRequest.getEmail());
	}

	@Test
	void deleteUserTest() throws Exception {
		UserResponseDTO user = createUser();
		assertThat(user.getId()).isNotNull();

		this.mockMvc
				.perform(delete("/api/v1/users/" + user.getId()))
				.andDo(print())
				.andExpect(status().isOk())
				.andReturn();

		this.mockMvc
				.perform(get("/api/v1/users/" + user.getId()))
				.andDo(print())
				.andExpect(status().isNotFound())
				.andReturn();
	}


//	@Test
//	void contextLoads() {
//		assertThat(userController).isNotNull();
//	}
//
//	@Test
//	void restTemplateTest(){
//		String output = this.restTemplate.getForObject("http://127.0.0.1:" + port+ "/" ,String.class);
//		assertThat(output).contains("Hello world!");
//	}
//
//	@Test
//	void testGetUser() {
//		User user = this.restTemplate.getForObject("http://127.0.0.1:" + port+ "/user", User.class);
//		assertThat(user.getName()).isEqualTo("Sem");
//		assertThat(user.getSurname()).isEqualTo("Kok");
//		assertThat(user.getEmail()).isEqualTo("kokshse196@proton.me");
//		assertThat(user.getPassword()).isEqualTo("password");
//	}
//
//	@Test
//	void testMockMvc()throws Exception{
//		this.mockMvc.perform(get("/"))
//				.andDo(print())
//				.andExpect(content()
//						.string(containsString
//								("Hello world!")));
//	}
//
//	@Test
//	void testMockMvcUser()throws Exception{
//		this.mockMvc.perform(get("/user"))
//				.andDo(print())
//				.andExpect(status().isOk())
//				.andExpect(jsonPath("$.name").value("Sem"))
//				.andExpect(jsonPath("$.surname").value("Kok"))
//				.andExpect(jsonPath("$.email").value("kokshse196@proton.me"))
//				.andExpect(jsonPath("$.password").value("password"));
//	}

}
