package com.develhope.springiterceptors.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/time")
public class BasicController {

    @GetMapping
    public LocalDateTime getActualDateTime(){
        return LocalDateTime.now();
    }
}
