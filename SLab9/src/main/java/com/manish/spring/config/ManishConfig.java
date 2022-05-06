package com.manish.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.manish.spring.to.Employee;
import com.manish.spring.to.Student;

public class ManishConfig {

	@Bean("stud")
	public Student getStudent() {
		Student st = new Student();
		st.setSid(101);
		st.setSname("Manish");
		return st;
	}

	@Bean("stud2")
	@Primary
	public Student getAnotherStudent() {
		Student st = new Student(102, "Rahul");
		return st;
	}

	@Bean("emp")
	@Primary
	public Employee getEmployee() {
		Employee e1 = new Employee(1001, "Kumar");
		return e1;
	}

	@Bean("emp2")
	public Employee getAnotherEmployee() {
		Employee e1 = new Employee();
		e1.setEid(1002);
		e1.setEname("Aadi");
		return e1;
	}

}
