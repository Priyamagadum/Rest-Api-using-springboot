package com.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.controller","com.service"}) //@ComponentScan is used to specify the packages to scan for components such as controllers and services
public class RestapiApplication {

    // Main entry point for the Spring Boot application
	public static void main(String[] args) {
        // Start the Spring Boot application
		SpringApplication.run(RestapiApplication.class, args);
	}

}
