package co.develhopestudy.demoweb.controllers;

import co.develhopestudy.demoweb.models.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2")
public class Es2_NewCiaoTestController {
//  -------------------------------------------------- ESERCIZO 2 --------------------------------------------------
//    Scrivi una applicazione web Spring Boot che alla endpoint GET v2/ciao/Lombardia?nome=Giuseppe risponde
//    con un oggetto JSON formato cosi:
//
//    {
//        "nome": "Giuseppe",
//            "provincia": "Lombardia",
//            "saluto": "Ciao Giuseppe, com'è il tempo in Lombardia?"
//    }

    @GetMapping("/ciao/{provincia}")
    public User tempoProvinciaV2(@PathVariable String provincia,

                                 @RequestParam(required = true)
                                 String nome,

                                 @RequestParam(required = false, defaultValue = "")
                                 String cognome) {

        return User.builder()
                .nome(nome)
                .cognome(cognome)
                .provincia(provincia)
                .saluto("Ciao, " + nome + " ,com`e il tempo in " + provincia)
                .build();
    }

//  ------------------------------------------------------ END ------------------------------------------------------

}
