package dev.semkoksharov.deploy_exercise_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/api/random")
public class RandomSumController {


    @GetMapping("/sum")
    public String randomIntSum() {
        Random random = new Random();

        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        int result = num1 + num2;

        return "Sum of  " + num1 + " and " + num2 + " = " + result;
    }
}
