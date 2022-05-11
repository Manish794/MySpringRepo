package com.test.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.test.spring.domain.Student;

@Configuration
public class StudentConfig {

	@Bean
	public Student stud() {
		System.out.println("-- Creating Student Bean --");
		Student st = new Student();
		st.setSid(101);
		st.setName("Manish");
		return st;
	}

}
