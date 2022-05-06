package com.manish.spring.config;

import org.springframework.context.annotation.Bean;

import com.manish.spring.to.Employee;
import com.manish.spring.to.Student;

public class ManishConfig {

	@Bean
	public Student stud() {
		Student st = new Student();
		st.setSid(101);
		st.setSname("Manish");
		return st;
	}

	@Bean
	public Employee emp() {
		Employee e1 = new Employee();
		e1.setEid(1001);
		e1.setEname("Kumar");
		return e1;
	}

}
