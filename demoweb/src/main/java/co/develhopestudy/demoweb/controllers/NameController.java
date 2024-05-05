package co.develhopestudy.demoweb.controllers;

import co.develhopestudy.demoweb.models.User;
import org.springframework.web.bind.annotation.*;
//  -------------------------------------------------- ESERCIZO 1 --------------------------------------------------

//scrivi una applicazione web Spring Boot con:
//NameController dove si mappa il parametro name per:
//restituire il nome alla chiamata GET
//restuiture il nome al contrario (es. da John a nhoJ, usando StringBuilder) alla chiamata POST
//testare le chiamate del API endpoint usando Postman


@RestController
@RequestMapping("/api/v3/name")
public class NameController {

    @GetMapping("/{name}")
    public String name(@PathVariable String name) {
        return name;
    }

    @PostMapping("/invert/{name}")
    public String invert(@PathVariable String name) {
        StringBuilder sb = new StringBuilder(name);
        return sb.reverse().toString();
    }
}


//  -------------------------------------------------- ESERCIZO 3 END --------------------------------------------------