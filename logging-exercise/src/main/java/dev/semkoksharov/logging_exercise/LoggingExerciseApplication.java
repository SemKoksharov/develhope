package dev.semkoksharov.logging_exercise;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class LoggingExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggingExerciseApplication.class, args);
	}

	@PostConstruct
	public void init() {
		File logDir = new File("./logs");
		if (!logDir.exists()) {
			logDir.mkdirs();
		}
	}
}
