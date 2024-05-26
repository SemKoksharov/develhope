package com.develhope.testcontroller.controllers;

import com.develhope.testcontroller.dtos.UserRequestDTO;
import com.develhope.testcontroller.dtos.UserResponseDTO;
import com.develhope.testcontroller.services.UserService;
import com.develhope.testcontroller.validation.ExceptionHandlers;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
public class UserController extends ExceptionHandlers {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id){
        Optional<UserResponseDTO> userFound = userService.getUserById(id);

        return userFound.isPresent() ? ResponseEntity.ok(userFound) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<?> getAllUsers() {
        List<UserResponseDTO> users = userService.getAllUsers();

        return !(users.isEmpty()) ? ResponseEntity.ok(users) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<?> saveUser(@Valid @RequestBody UserRequestDTO request) {
        UserResponseDTO response = userService.saveUser(request);

        return response != null ? ResponseEntity.ok(response) : ResponseEntity.badRequest().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(
            @Valid @RequestBody UserRequestDTO request,
           @PathVariable Long id) {

        Optional<UserResponseDTO> updatedUser = userService.updateUser(request, id);
        return updatedUser.isPresent() ? ResponseEntity.ok(updatedUser) : ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable Long id) {

        boolean isDeleted = userService.deleteUserByID(id);
        return isDeleted ? ResponseEntity.ok("User(ID = " + id + ") deleted!") :
               ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found!");
    }

    @DeleteMapping
    public ResponseEntity<?> deleteAllUsers(){
        userService.deleteAllUsers();
        return ResponseEntity.ok().body("All users deleted");
    }


}
