package com.manish.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manish.spring.config.ManishConfig;
import com.manish.spring.to.Employee;
import com.manish.spring.to.Student;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ManishConfig.class);
		System.out.println("Spring Container is started");
		
		Student st = context.getBean(Student.class);
		st.show();

		Employee em = context.getBean(Employee.class);
		em.display();
		
		Student st1 = context.getBean("stud",Student.class);
		st1.show();

		Employee em1 = context.getBean("emp", Employee.class);
		em1.display();
		
		Student st2 = context.getBean("stud2",Student.class);
		st2.show();

		Employee em2 = context.getBean("emp2", Employee.class);
		em2.display();

		System.out.println("Main Completed");

	}
}
