package co.develhope.customqueries.controllers;

import co.develhope.customqueries.entities.Error;
import co.develhope.customqueries.exceptions.EmptyResultException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

    private final String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());


    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Error> handleIllegalArgExceptions(IllegalArgumentException ex) {
        return createErrorResponse(ex, HttpStatus.BAD_REQUEST);
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(EmptyResultException.class)
    public ResponseEntity<Error> handleEmptyResultExceptions(EmptyResultException ex) {
        return createErrorResponse(ex, HttpStatus.BAD_REQUEST);
    }


    private ResponseEntity<Error> createErrorResponse(Exception ex, HttpStatus status) {
        String message = ex.getMessage();
        String timestamp = this.timestamp;
        String stackTrace = Arrays.toString(ex.getStackTrace());

        Error error = new Error(message, timestamp, stackTrace);

        return ResponseEntity.status(status).body(error);
    }
}

