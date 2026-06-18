package com.exam.exception;

public class DuplicatedIDException extends RuntimeException {
    public DuplicatedIDException(String message) {
        super(message);
    }
}
