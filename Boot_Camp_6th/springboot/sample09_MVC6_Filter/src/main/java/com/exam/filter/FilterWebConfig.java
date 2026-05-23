package com.exam.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class FilterWebConfig implements WebMvcConfigurer {

    // Filter를 등록하는 메서드가 제공도되지 않아 만들어 주어야된다.
    @Bean
    public FilterRegistrationBean<MyFilter> filterRegistrationBean(){
        FilterRegistrationBean<MyFilter> filterRegistrationBean = new FilterRegistrationBean(new MyFilter());
        filterRegistrationBean.addUrlPatterns("/*");    // 모든 요청에서 filter가 적용된다
        return filterRegistrationBean;
    }
}
