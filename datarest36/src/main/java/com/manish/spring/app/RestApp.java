package com.manish.spring.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.manish.spring")
@EntityScan(basePackages = {"com.manish.spring.entity"} )
@EnableJpaRepositories(basePackages = {"com.manish.spring.repo"})
public class RestApp {
	public static void main(String[] args) {
		SpringApplication.run(RestApp.class, args);
	}
}
