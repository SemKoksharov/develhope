package co.develhope.customqueries.exceptions;

public class EmptyResultException extends RuntimeException{
    public EmptyResultException(String message) {
        super(message);
    }
}
