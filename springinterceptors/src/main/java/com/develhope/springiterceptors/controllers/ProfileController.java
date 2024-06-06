package com.develhope.springiterceptors.controllers;

import com.develhope.springiterceptors.entities.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/prof")
public class ProfileController {

    @GetMapping
    public User get(HttpServletRequest request) {
        return (User) request.getAttribute("user");
    }
}
