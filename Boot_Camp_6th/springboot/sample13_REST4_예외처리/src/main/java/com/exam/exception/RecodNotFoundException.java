package com.exam.exception;

public class RecodNotFoundException extends RuntimeException{
    public RecodNotFoundException(String message){
        super(message);
    }
}
