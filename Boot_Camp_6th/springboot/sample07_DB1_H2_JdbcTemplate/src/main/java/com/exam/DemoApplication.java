package com.exam;

import com.exam.dto.TodoDTO;
import com.exam.service.TodoService;
import com.exam.service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    TodoService todoService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World");

        int save = todoService.save(new TodoDTO(4,"이순신","Learn Docker"));
        System.out.println("------------------");

        int update = todoService.update(new TodoDTO(4,"이순신2","Learn Docker, k8s"));
        System.out.println("------------------");

        int delete = todoService.delete(3);
        System.out.println("------------------");

        List<TodoDTO> list = todoService.findAll();
        System.out.println(list);
        System.out.println("------------------");

        TodoDTO todoDTO = todoService.findByid(1);
        System.out.println(todoDTO);
        System.out.println("------------------");

    }

    public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
