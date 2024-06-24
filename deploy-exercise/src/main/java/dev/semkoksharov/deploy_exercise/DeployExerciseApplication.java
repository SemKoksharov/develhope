package dev.semkoksharov.deploy_exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeployExerciseApplication {

	public static void main(String[] args) {
		System.out.println("My crazy app version 0.0.3 started");
		SpringApplication.run(DeployExerciseApplication.class, args);
	}

}
