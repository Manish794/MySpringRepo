package com.manish.spring.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.spring.config.EmployeeConfig;

@SpringBootApplication(exclude = EmployeeConfig.class, scanBasePackages = { "com.manish.spring" })
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}