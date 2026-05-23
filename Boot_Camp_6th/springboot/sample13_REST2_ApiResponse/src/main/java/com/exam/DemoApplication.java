package com.exam;

import com.exam.dto.TodoDTO;
import com.exam.service.TodoMybatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    TodoMybatisService todoMybatisService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("DeomoApplication RUN");
    }

    public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

    }
}
