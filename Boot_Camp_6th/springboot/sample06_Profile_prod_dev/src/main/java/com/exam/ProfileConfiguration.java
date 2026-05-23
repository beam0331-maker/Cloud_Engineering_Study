package com.exam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfiguration {

    @Bean
    @Profile("prod")
    public String creatProd(){
        System.out.println("creatProd");
        return "prod 관련 객체 생성";
    }

    @Bean
    @Profile("dev")
    public String creatDev(){
        System.out.println("creatDev");
        return "dev 관련 객체 생성";
    }
}

