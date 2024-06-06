package co.develhope.springinterceptors2.controllers;

import co.develhope.springinterceptors2.entities.Month;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/months")
public class MonthController {

    @GetMapping
    public Month returnMonth(HttpServletRequest request){
        return (Month) request.getAttribute("month");
    }

}
