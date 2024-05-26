package com.develhope.testcontroller.dtos;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.lang.NonNull;

public class UserRequestDTO {
    @Valid
    @NotNull(message = "Name is null!")
    @NotBlank(message = "Name is blank!")
    @Size(min = 2, max = 200, message = "Name must be min 2 characters, max 200 characters")
    private String name;


    @NotNull(message = "Surname is null!")
    @NotBlank(message = "Surname is blank!")
    @Size(min = 2, max = 200, message = "Surname must be min 2 characters, max 200 characters")
    private String surname;


    @NotNull(message = "Email is null!")
    @NotBlank(message = "Email is blank!")
    @Size(min = 5,  message = "Email must be min 5 characters")
    private String email;


    @NotNull(message = "Password is null!")
    @NotBlank(message = "Password is blank!")
    @Size(min = 8, max = 40, message = "Password must be min 4, max 40 characters")
    private String password;

    public UserRequestDTO(String name, String surname, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

    public UserRequestDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
