package com.exam.ApiRespose;

import lombok.*;

/*
{
    success: true|false,
    message: "요청이 성공했습니다.",
    data: {
        "id":1,
        "name":"홍길동",
        "job": "Learn Spring"
    }
}
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class ApiResponse<T> {

    boolean success;
    String message;
    T data;

    public static <T> ApiResponse<T> ok(String message, T data){
        return ApiResponse
                .<T>builder()
                .data(data)
                .success(true)
                .message(message)
                .build();
    }
    public static <T> ApiResponse<T> fail(String message,T data){
        return ApiResponse
                .<T>builder()
                .data(data)
                .success(false)
                .message(message)
                .build();
    }

}
