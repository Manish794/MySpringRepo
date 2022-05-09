package com.manish.spring.config;

import org.springframework.context.annotation.Bean;

import com.manish.spring.to.HelloProcessor;
import com.manish.spring.to.Student;

public class ManishConfig {

	@Bean(name="myStudBean", initMethod = "readData", destroyMethod = "updateData")
	public Student getStudent() {
		Student st = new Student();
		return st;
	}
	
	@Bean
	public HelloProcessor helloProcessor() {
		return new HelloProcessor();
	}

}
