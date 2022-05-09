package com.manish.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manish.spring.config.ManishConfig;
import com.manish.spring.to.Employee;
import com.manish.spring.to.Student;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ManishConfig.class);
		System.out.println("******* Spring Container is started");

		Employee emp1 = context.getBean(Employee.class);
		System.out.println(emp1);
		Employee emp2 = context.getBean(Employee.class);
		System.out.println(emp2);
		Employee emp3 = context.getBean(Employee.class);
		System.out.println(emp3);
		Employee emp4 = context.getBean(Employee.class);
		System.out.println(emp4);
		
		System.out.println(emp1 == emp2);
		System.out.println(emp1 == emp3);
		System.out.println(emp1 == emp4);
		
		
		
		System.out.println("-- Accessing Student");
		
		Student stu1 = context.getBean(Student.class);
		System.out.println(stu1);
		Student stu2 = context.getBean(Student.class);
		System.out.println(stu2);
		Student stu3 = context.getBean(Student.class);
		System.out.println(stu3);
		Student stu4 = context.getBean(Student.class);
		System.out.println(stu4);
		
		System.out.println(stu1 == stu2);
		System.out.println(stu1 == stu3);
		System.out.println(stu1 == stu4);


		System.out.println("Main Completed");

	}
}
