package co.develhopestudy.demoweb.controllers;

import co.develhopestudy.demoweb.models.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/ciao")
public class HWController {

    @GetMapping("/hw")

    public String helloWorld() {
        return "Hello World! / Привет Мир!";
    }

    @GetMapping("/howau")
    public String howAreYou(@RequestParam(required = true)
                            String name,

                            @RequestParam(required = false, defaultValue = "")
                            String surname) {

        return "Hello " + name + " " + surname +
                " How are you?";
    }

//  -------------------------------------------------- ESERCIZO 1 --------------------------------------------------
//    Scrivi una applicazione web Spring Boot che alla endpoint GET v1/ciao?nome=Giuseppe&provincia=Lombardia
//    risponde con "Ciao Giuseppe, com'è il tempo in Lombardia?"

    @GetMapping
    public String tempoProvincia(@RequestParam(required = true)
                                 String nome,

                                 @RequestParam(required = false, defaultValue = "tua provincia")
                                 String provincia) {

        return "Ciao " + nome + ", " +
                "com`e il tempo in " + provincia + "?";
    }
//  ------------------------------------------------------ END ------------------------------------------------------

    @GetMapping("/show_object/{id}")
    public User showUserJson(@PathVariable long id,

                             @RequestParam(required = true)
                             String name,

                             @RequestParam(required = false, defaultValue = "")
                             String surname) {
        return User.builder()
                .id(id)
                .nome(name)
                .cognome(surname)
                .build();
    }
 //---------------------------- ESERCIZIO SI TROVA IN CLASSE Es2NewCiaoTestController --------------------------------
}
