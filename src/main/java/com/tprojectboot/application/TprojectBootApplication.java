package com.tprojectboot.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.annotation.Validated;

@SpringBootApplication
// @SpringBootApplication = @Configuration + @EnableAutoConfiguration + @ComponentScan
public class TprojectBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TprojectBootApplication.class, args);
        System.out.println("start spring boot project and db setting complete...");
	}
}
