package com.manish.spring.config;

import org.springframework.context.annotation.Bean;

import com.manish.spring.to.Employee;
import com.manish.spring.to.Student;

public class ManishConfig {

	@Bean("stud")
	public Student getStudent() {
		Student st = new Student();
		return st;
	}

	@Bean("emp")
	public Employee getEmployee() {
		Employee e1 = new Employee();
		return e1;
	}

}
