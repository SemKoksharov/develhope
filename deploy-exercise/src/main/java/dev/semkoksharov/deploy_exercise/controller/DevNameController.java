package dev.semkoksharov.deploy_exercise.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dev/")
public class DevNameController {

    @Value("${devName}")
    private String devName;

    @GetMapping("/name")
    public String getDevName() {
        return "Hi " + devName + "!";
    }
}