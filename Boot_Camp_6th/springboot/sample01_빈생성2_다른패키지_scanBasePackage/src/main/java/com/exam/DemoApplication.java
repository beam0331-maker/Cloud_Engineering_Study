package com.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackages = {"com.other" /*, "다른패키지"*/})
@SpringBootApplication(scanBasePackageClasses = {com.other.EmpDAO.class})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
        System.out.println("Hello World");
	}
}
