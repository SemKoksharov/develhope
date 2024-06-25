package dev.semkoksharov.deploy_env_variables_2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeController {

    @Value("${msg.welcomeMessage}")
    private String welcomeMessage;

@GetMapping("/welcome")
    private String welcomeMessage(){
        return welcomeMessage;
    }

}
