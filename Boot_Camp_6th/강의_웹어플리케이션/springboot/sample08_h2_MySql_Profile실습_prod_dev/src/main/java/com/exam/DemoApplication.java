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
        System.out.println("Hello World");

        int save = todoMybatisService.save(new TodoDTO(10,"홍길동","Learn Spring"));
        System.out.println("-------- save ---------");

        int update = todoMybatisService.updateById(new TodoDTO(10,"홍길동2","Learn Spring Boot"));
        System.out.println("-------- update -------");

        int delete = todoMybatisService.deleteById(3);
        System.out.println("-------- delete -------");

        List<TodoDTO> list = todoMybatisService.findAll();
        System.out.println(list);
        System.out.println("-----------------------");

        TodoDTO dto = todoMybatisService.findById(1);
        System.out.println(dto);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
