package dev.semkoksharov.logging_exercise.controller;

import dev.semkoksharov.logging_exercise.service.CalcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
public class HomeController {

    @Value("${custom.env.value1}")
    private int value1;
    @Value("${custom.env.value2}")
    private int value2;

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    private final CalcService calcService;

    @Autowired
    public HomeController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping("/")
    public String welcome() {
        String message = "Welcome to the Spring Boot application!";
        logger.info(message);
        logger.info("Message was printed");

        return message;
    }

    @GetMapping("/calculate")
    public double calc() {
        logger.info("Calculation started");
        double result = calcService.exponentCalc(value1, value2);
        logger.info("Calculation finished");

        return result;
    }

    @GetMapping("/errors")
    public void spaccare(){
       try{
           logger.error("sono programmatore stupido voglio un po di errori");
           logger.error("3...2....1......BOOOM....BAAANNG");
           throw new Error("Sono troppo cattivo");
       } finally {
           System.exit(666);
       }

    }
}
