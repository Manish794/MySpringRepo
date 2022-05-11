package com.test.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.test.spring.domain.Employee;

@Configuration
public class EmployeeConfig {

	@Bean
	public Employee emp() {
		System.out.println("-- Creating Employee Bean --");
		Employee st = new Employee();
		st.setEid(101);
		st.setName("Manish");
		return st;
	}

}
