package com.exam.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorWebConfig implements WebMvcConfigurer {

    // Interceptor를 등록하는 메서드가 제공되어 재정의 하면된다.
    @Autowired
    MyInterceptor myInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        // Interceptor 자바파일이 bean으로 동록되지 않았을경우
        // registry.addInterceptor(new MyInterceptor());
        registry.addInterceptor(myInterceptor).addPathPatterns("/main","/aaa/*","/bbb*");
    }
}
