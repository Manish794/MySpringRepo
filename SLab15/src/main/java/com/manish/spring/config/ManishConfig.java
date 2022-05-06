package com.manish.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.manish.spring.to.Employee;

@ComponentScan("com.manish.spring.to")
public class ManishConfig {

	@Bean("emp")
	public Employee getEmployee() {
		Employee e1 = new Employee(1001, "Kumar");
		return e1;
	}

}
