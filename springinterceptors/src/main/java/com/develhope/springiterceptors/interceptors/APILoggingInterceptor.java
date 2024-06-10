package com.develhope.springiterceptors.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.time.Clock;
import java.time.LocalDateTime;

@Component
public class APILoggingInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        long startTime = System.currentTimeMillis();

        System.out.println("[ API_LOGGING_INTERCEPTOR_MSG ] :: User-Agent :: "+ request.getHeader("User-Agent"));
        System.out.println("[ API_LOGGING_INTERCEPTOR_MSG ] :: Request URL :: "+ request.getRequestURL().toString() +
                " :: CURRENT TIME AND DATE = " + LocalDateTime.now());

        request.setAttribute("startTime", startTime);

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("[ API_LOGGING_INTERCEPTOR_MSG ] :: Request URL :: "+ request.getRequestURL().toString() +
                " :: Sent in handler :: Current Time = " + LocalDateTime.now());
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        long startTime = (long) request.getAttribute("startTime");
        System.out.println("[ API_LOGGING_INTERCEPTOR_MSG ] :: Request URL :: "+ request.getRequestURL().toString() +
                " :: Sent in handler :: End Time = " + LocalDateTime.now());

        System.out.println("[ API_LOGGING_INTERCEPTOR_MSG ] :: Request URL :: "+ request.getRequestURL().toString() +
                " :: Sent in handler :: Time taken = " + (System.currentTimeMillis()- startTime) + " milliseconds");

        if(ex != null){
            System.out.println("The exception is " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
