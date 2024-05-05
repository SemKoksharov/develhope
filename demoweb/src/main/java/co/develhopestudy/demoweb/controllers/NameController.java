package co.develhopestudy.demoweb.controllers;

import co.develhopestudy.demoweb.services.NameService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
//  -------------------------------------------------- ESERCIZO 3 --------------------------------------------------

//scrivi una applicazione web Spring Boot con:
//NameController dove si mappa il parametro name per:
//restituire il nome alla chiamata GET
//restuiture il nome al contrario (es. da John a nhoJ, usando StringBuilder) alla chiamata POST
//testare le chiamate del API endpoint usando Postman

@RestController
@RequestMapping("/api/v3/name")
@AllArgsConstructor
public class NameController {

    private final NameService nameService;

    @GetMapping("/{name}")
    public String name(@PathVariable String name) {
        return nameService.returnName(name);
    }

    @PostMapping("/invert/{name}")
    public String invert(@PathVariable String name) {
       return nameService.invertName(name);
    }
}


//  -------------------------------------------------- ESERCIZO 3 END --------------------------------------------------