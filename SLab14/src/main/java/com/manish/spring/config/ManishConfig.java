package com.manish.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.manish.spring.to.Employee;
import com.manish.spring.to.Student;

@ComponentScan("com.manish.spring.to")
public class ManishConfig {

	@Bean("stud")
	public Student getStudent() {
		Student st = new Student();
		st.setSid(101);
		st.setSname("Manish");
		return st;
	}

	@Bean("emp")
	public Employee getEmployee() {
		Employee e1 = new Employee(1001, "Kumar");
		return e1;
	}

}
