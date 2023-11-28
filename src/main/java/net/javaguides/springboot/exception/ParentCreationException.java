package net.javaguides.springboot.exception;

import org.springframework.http.HttpStatus;

public class ParentCreationException extends RuntimeException {
    private final HttpStatus httpStatus;

    public ParentCreationException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}