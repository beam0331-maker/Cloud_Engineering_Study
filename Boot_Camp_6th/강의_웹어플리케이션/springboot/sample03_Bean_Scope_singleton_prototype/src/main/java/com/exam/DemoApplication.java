package com.exam;

import com.exam.service.DeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    // IoC Container 주입
    @Autowired
    ApplicationContext acx;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World");
        DeptServiceImpl service1 =  acx.getBean("service",DeptServiceImpl.class);
        DeptServiceImpl service2 =  acx.getBean("service",DeptServiceImpl.class);
        System.out.println(service1 == service2);
    }
}
