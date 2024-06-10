package com.develhope.springiterceptors.interceptors;


import com.develhope.springiterceptors.entities.Error;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class LegacyInterceptor implements HandlerInterceptor {

    private final ObjectMapper om = new ObjectMapper();

    private String convertObjectToJson(Object object) throws IOException {
        return om.writeValueAsString(object);
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if (!request.getRequestURL().toString().contains("/api/legacy")) {
            return true;
        } else {

            HttpStatus status = HttpStatus.GONE;
            String message = "::::::[ LEGACY_INTERCEPTOR_MSG ] :::::: ENDPOINT " +
                    request.getRequestURL().toString() + " IS BLOCKED ::::::";
            String timestamp = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date());

            Error error = new Error(
                    message,
                    status.toString(),
                    timestamp
            );

            response.setStatus(status.value());
            System.out.println(message);

            String jsonResponse = convertObjectToJson(error);


            response.getWriter().write(jsonResponse);

            return false;
        }

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }


    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}




