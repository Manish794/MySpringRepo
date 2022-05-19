package com.capgemini.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = { "com.capgemini.controller", "com.capgemini.service", "com.capgemini.dao" })
@EnableJpaRepositories("com.capgemini.dao")
@EntityScan("com.capgemini.entity")
public class MobileApp {
	public static void main(String[] args) {
		SpringApplication.run(MobileApp.class, args);
	}
}
