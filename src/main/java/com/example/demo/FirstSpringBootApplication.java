package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(FirstSpringBootApplication.class, args);
		
		Student student = context.getBean(Student.class);
		
		student.show();
		 
	}

}
