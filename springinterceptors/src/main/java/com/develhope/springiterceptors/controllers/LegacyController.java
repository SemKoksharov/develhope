package com.develhope.springiterceptors.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/legacy")
public class LegacyController {

    @GetMapping
    public String oldCode() {
        return "This is just old code";
    }
}
