package com.exam.config;

import com.exam.controller.DeptController;
import com.exam.dao.DeptDAO;
import com.exam.service.ServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// DeptCoontroller, DeptServiceImpl, DeptDAO를 명시적으로 생성
@Configuration
public class DeptConfiguration {


    @Bean
    public DeptDAO creatDeptDAO(){
        return new DeptDAO();
    }
    @Bean
    public DeptController creatDeptController(){
        return new DeptController();
    }

    @Bean
    public ServiceImpl creatServiceImpl(){
        return new ServiceImpl();
    }

}
