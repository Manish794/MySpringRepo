package com.manish.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manish.spring.to.Employee;
import com.manish.spring.to.Student;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("manish-spring-config.xml");
		System.out.println("Spring Container is started");


		Employee em = context.getBean(Employee.class);
		em.display();
		
		/*
		 * Student st = context.getBean(Student.class); 
		 * st.show();
		 */
		
		Student s1 =  context.getBean("st1", Student.class);
		s1.show();
		
		Student s2 =  context.getBean("st2", Student.class);
		s2.show();
		
		Student s3 =  context.getBean("st3", Student.class);
		s3.show();

		System.out.println("Main Completed");

	}
}
