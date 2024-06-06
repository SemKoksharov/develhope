package co.develhope.springinterceptors2.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/basic")
public class BasicController {

    @GetMapping
    public String helloUser(HttpServletRequest request){
        return request.getHeader("User-Name") != null ? "Hello " + request.getHeader("User-Name") + "!" : "Hello Unknown User!";
    }
}
