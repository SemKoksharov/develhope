package co.develhopestudy.demoweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ciao")
public class HWController {

    @GetMapping("/hw/")
    public String helloWorld() {
        return "Hello World! / Привет Мир!";
    }

    @GetMapping("/howau/")
    public String howAreYou(@RequestParam(required = true)
                       String name,

                       @RequestParam(required = false, defaultValue = "")
                       String surname) {

        return "Hello " + name + " " + surname +
                " How are you?";
    }

    @GetMapping
    public String tempoProvincia(@RequestParam(required = true)
                       String nome,

                       @RequestParam(required = false, defaultValue = "tua provincia")
                       String provincia) {

        return "Ciao " + nome + ", " +
                "com`e il tempo in "+ provincia+"?";
    }
}
