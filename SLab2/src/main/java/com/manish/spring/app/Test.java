package com.manish.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manish.spring.to.Employee;
import com.manish.spring.to.Student;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("manish-spring-config.xml");
		System.out.println("Spring Container is started");
		
		Student st = context.getBean(Student.class);
		st.show();

		Employee em = context.getBean(Employee.class);
		em.display();

		System.out.println("Main Completed");

	}
}
