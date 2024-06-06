package com.develhope.springiterceptors.interceptors;

import com.develhope.springiterceptors.entities.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class LoggedUserInterceptor implements HandlerInterceptor {

    public static List<User> users = new ArrayList<>(Arrays.asList(

            new User(1, "Luca", "Rossi", "Rome"),
            new User(2, "Giulia", "Bianchi", "Milan"),
            new User(3, "Marco", "Ferrari", "Florence"),
            new User(4, "Sophia", "Russo", "Naples"),
            new User(5, "Matteo", "Conti", "Venice")
    ));

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String stringUserID = request.getHeader("userId");
        if (stringUserID == null) {
            return true;
        }

        long userId = Long.parseLong(stringUserID);

        Optional<User> user = users.stream().filter(singleUser -> {
           return singleUser.getId() == userId;
        }).findFirst();

        if (user.isPresent()) {
            request.setAttribute("user", user.get());
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }


    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
