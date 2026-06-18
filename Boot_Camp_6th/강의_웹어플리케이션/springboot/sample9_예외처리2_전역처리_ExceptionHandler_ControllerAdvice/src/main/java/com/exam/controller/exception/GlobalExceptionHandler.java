package com.exam.controller.exception;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value= {IllegalArgumentException.class, NullPointerException.class, ArithmeticException.class})
    public String handleException(Exception e, Model model) {
        model.addAttribute("message",e.getMessage());
        return "error/error";
    }
}
