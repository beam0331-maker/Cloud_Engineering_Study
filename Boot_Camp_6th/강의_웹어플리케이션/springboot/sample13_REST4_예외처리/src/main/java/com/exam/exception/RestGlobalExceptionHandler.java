package com.exam.exception;

import com.exam.ApiRespose.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestGlobalExceptionHandler {

    @ExceptionHandler(value = {RecodNotFoundException.class})
    public ResponseEntity<ApiResponse<Void>> RecodNotFoundException(Exception e) {
        ApiResponse<Void> apiResponse = ApiResponse.fail(e.getMessage(),null);
        System.out.println("RecodNotFoundException>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(apiResponse);
    }

    @ExceptionHandler(value = {DuplicatedIDException.class})
    public ResponseEntity<ApiResponse<Void>> DuplicatedIDException(Exception e) {
        ApiResponse<Void> apiResponse = ApiResponse.fail(e.getMessage(),null);
        System.out.println("DuplicatedIDException>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        return ResponseEntity.status(HttpStatus.CONFLICT).body(apiResponse);
    }


}
