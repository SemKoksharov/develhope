package co.develhopestudy.demoweb.controllers;

import co.develhopestudy.demoweb.services.NameService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
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

    @Operation(summary = "Return name", description = "Returns the name")
    @ApiResponse(responseCode = "200", description = "Name successfully returned")
    @GetMapping("/{name}")
    public String name(@PathVariable String name) {
        return nameService.returnName(name);
    }
    @Operation(summary = "Reverse name", description = "Returns the reversed name")
    @ApiResponse(responseCode = "200", description = "Successfully reversed name")
    @PostMapping("/invert/{name}")
    @CrossOrigin(origins = "http://localhost:3346" )
    public String invert(@PathVariable String name) {
       return nameService.invertName(name);
    }
}


//  -------------------------------------------------- ESERCIZO 3 END --------------------------------------------------