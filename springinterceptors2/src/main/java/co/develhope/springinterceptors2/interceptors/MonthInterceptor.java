package co.develhope.springinterceptors2.interceptors;

import co.develhope.springinterceptors2.entities.Month;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class MonthInterceptor implements HandlerInterceptor {

    public static List<Month> months = new ArrayList<>(Arrays.asList(

            new Month(1, "January", "Gennaio", "Januar"),
            new Month(2, "February", "Febbraio", "Februar"),
            new Month(3, "March", "Marzo", "März"),
            new Month(4, "April", "Aprile", "April"),
            new Month(5, "May", "Maggio", "Mai"),
            new Month(6, "June", "Giugno", "Juni")


    ));


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if (request.getRequestURL().toString().contains("/months")){
            String monthNumberString = request.getHeader("MonthID");

            if (monthNumberString == null || monthNumberString.isBlank() || monthNumberString.isEmpty()) {
                response.setStatus(HttpStatus.BAD_REQUEST.value());
                throw new IllegalArgumentException(":::::::[ERROR_MSG] ::: The month cannot be null | empty | blank ! :::::::");
            }

            int monthNumb = Integer.parseInt(monthNumberString);

            Optional<Month> month = months.stream()
                    .filter(singleMonth -> singleMonth.getMonthNumber() == monthNumb)
                    .findFirst();

            if (month.isPresent()) {
                request.setAttribute("month", month.get());
            } else {
                request.setAttribute(
                        "month",

                        new Month(
                                0,
                                "nope",
                                "nope",
                                "nope"
                        ));
            }
            response.setStatus(HttpStatus.OK.value());

            return true;
        } else {
            return true;
        }

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}