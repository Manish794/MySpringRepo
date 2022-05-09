package com.manish.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.manish.spring.to.Employee;
import com.manish.spring.to.Student;

public class ManishConfig {

	@Bean("stud")
	@Scope("prototype")
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
