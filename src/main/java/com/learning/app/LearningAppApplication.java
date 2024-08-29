package com.learning.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.learning.app.service", "com.learning.app.repository" , "com.learning.app.controller"})
public class LearningAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(LearningAppApplication.class, args);
	}

}
