package org.example.exception;

public class AlreadyExisteException extends RuntimeException {
    public AlreadyExisteException(String msg) {
        super(msg);
    }
}
