package com.exam.exception;

import com.exam.ApiRespose.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {RecodNotFoundException})
    public ResponseEntity<ApiResponse<String>> handleException(Exception e) {}
}
