package com.manish.spring.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manish.spring.config.ManishConfig;
import com.manish.spring.to.Employee;
import com.manish.spring.to.Student;

public class Test {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ManishConfig.class);
		System.out.println("******* Spring Container is started");

		Employee emp1 = context.getBean(Employee.class);
		System.out.println(emp1);
		
		Student stu1 = context.getBean(Student.class);
		System.out.println(stu1);
		
		
		
		System.out.println("\n******* Closing Spring Container");
		context.registerShutdownHook();
		context.close();

		System.out.println("Main Completed");

	}
}
