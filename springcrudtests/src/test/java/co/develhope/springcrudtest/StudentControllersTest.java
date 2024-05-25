package co.develhope.springcrudtest;

import co.develhope.springcrudtest.controllers.StudentController;
import co.develhope.springcrudtest.entities.Student;
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
class StudentControllersTest {

    @Autowired
    private StudentController studentController;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    private Student createStudent() throws Exception {

        Student student = new Student();
        student.setName("Sem");
        student.setSurname("Kok");
        student.setWorking(true);

        return createStudent(student);

    }

    private Student createStudent(Student student) throws Exception {
        MvcResult result = createStudentRequest(student);
        Student createdStudent = objectMapper.readValue(result.getResponse().getContentAsString(), Student.class);
        assertThat(createdStudent.getId()).isNotNull();
        return createdStudent;

    }

    private MvcResult createStudentRequest() throws Exception {

        Student student = new Student();
        student.setName("Request");
        student.setSurname("Student");
        student.setWorking(true);

        return createStudentRequest(student);

    }

    private MvcResult createStudentRequest(Student student) throws Exception {

        if (student == null) {
            return null;
        }
        String userJson = objectMapper.writeValueAsString(student);

        return this.mockMvc
                .perform(post("/api/students")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(userJson))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    void studentControllerLoads() {
        assertThat(studentController).isNotNull();
    }


    @Test
    void createUserTest() throws Exception {

        Student createdStudent = createStudent();
        assertThat(createdStudent.getId()).isNotNull();

    }

    @Test
    void getAllStudentsTest() throws Exception {

        createStudent();
        createStudent();
        createStudent();
        createStudent();

        MvcResult result = this.mockMvc
                .perform(get("/api/students"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        List<Student> allStudents = objectMapper.readValue(result.getResponse().getContentAsString(), List.class);
        System.out.println("Students in DB: " + allStudents);
        assertThat(allStudents.size()).isNotZero();

    }

    @Test
    void getStudentByIdTest() throws Exception {

        Student student = createStudent();

        assertThat(student.getId()).isNotNull();
        MvcResult result = this.mockMvc
                .perform(get("/api/students/" + student.getId()))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        Student studentFound = objectMapper.readValue(result.getResponse().getContentAsString(), Student.class);
        System.out.println("Student in DB: " + studentFound);
        assertThat(studentFound.getId()).isEqualTo(student.getId());

    }

    @Test
    void updateStudentTest() throws Exception {

        Student student = createStudent();
        assertThat(student.getId()).isNotNull();

        String userJson = objectMapper.writeValueAsString(student);

        MvcResult result = this.mockMvc
                .perform(put("/api/students/" + student.getId())
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(userJson))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        Student updatedStudent = objectMapper.readValue(result.getResponse().getContentAsString(), Student.class);
        assertThat(updatedStudent.getId()).isEqualTo(student.getId());
        assertThat(updatedStudent.getName()).isEqualTo(student.getName());
        assertThat(updatedStudent.getSurname()).isEqualTo(student.getSurname());
        assertThat(updatedStudent.getWorking()).isEqualTo(student.getWorking());
    }

    @Test
    void updateIsWorkingFalseTest() throws Exception {
        Student student = createStudent();
        assertThat(student.getId()).isNotNull();
        String userJson = objectMapper.writeValueAsString(student);

        MvcResult result = this.mockMvc
                .perform(patch("/api/students/" + student.getId()+"/working?working=false")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(userJson))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        Student updatedStudent = objectMapper.readValue(result.getResponse().getContentAsString(), Student.class);
        assertThat(student.getId()).isEqualTo(updatedStudent.getId());
        assertThat(updatedStudent.getWorking()).isEqualTo(false);

    }

    @Test
    void updateIsWorkingTrueTest() throws Exception {
        Student student = createStudent();
        assertThat(student.getId()).isNotNull();
        String userJson = objectMapper.writeValueAsString(student);

        MvcResult result = this.mockMvc
                .perform(patch("/api/students/" + student.getId()+"/working?working=true")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(userJson))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        Student updatedStudent = objectMapper.readValue(result.getResponse().getContentAsString(), Student.class);
        assertThat(student.getId()).isEqualTo(updatedStudent.getId());
        assertThat(updatedStudent.getWorking()).isEqualTo(true);

    }

    @Test
    void deleteStudentTest() throws Exception {
        Student student = createStudent();
        assertThat(student.getId()).isNotNull();

        this.mockMvc
                .perform(delete("/api/students/" + student.getId()))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();


        MvcResult result = this.mockMvc
                .perform(get("/api/students/" + student.getId()))
                .andDo(print())
                .andExpect(status().isNotFound())
                .andReturn();

    }

}
