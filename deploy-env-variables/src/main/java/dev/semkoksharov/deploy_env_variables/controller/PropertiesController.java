package dev.semkoksharov.deploy_env_variables.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PropertiesController {

    @Value("${devProperties.authCode}")
    private String authCode;

    @Value("${devProperties.devName}")
    private String devName;

    @GetMapping("/ciao")
    public String getProperties() {
        return "Hello " + devName + "! Auth code: " + authCode;
    }

}