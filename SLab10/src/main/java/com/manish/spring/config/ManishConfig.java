package com.manish.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.manish.spring.to.Employee;
import com.manish.spring.to.Service;
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

	@Bean("serv1")
	public Service getService1() {
		return new Service();
	}

	@Bean("serv2")
	public Service getService2(Student st) {
		Service s = new Service();
		s.setStud(st);
		return s;
	}

	@Bean("serv3")
	public Service getService3(Student st, Employee emp) {
		Service s = new Service();
		s.setStud(st);
		s.setEmp(emp);
		return s;
	}
	
	@Bean("serv4")
	public Service getService4(Student st, Employee emp) {
		Service s = new Service(st, emp);
		return s;
	}

}
