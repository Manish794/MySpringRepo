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
		Employee emp2 = context.getBean(Employee.class);
		Employee emp3 = context.getBean(Employee.class);
		Employee emp4 = context.getBean(Employee.class);

		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		
		System.out.println("Modifying the Employee object data ");
		emp1.eid = 1001;
		emp1.ename = "Manish";
		emp2.eid = 1002;
		emp2.ename = "Kumar";
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		
		
		System.out.println(emp1 == emp2);
		System.out.println(emp1 == emp3);
		System.out.println(emp1 == emp4);
		
		
		
		System.out.println("-- Accessing Student");
		
		Student stu1 = context.getBean(Student.class);
		Student stu2 = context.getBean(Student.class);
		Student stu3 = context.getBean(Student.class);
		Student stu4 = context.getBean(Student.class);
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);
		System.out.println(stu4);
		System.out.println("Modifying the Student object data ");
		stu1.sid = 101;
		stu1.sname="Manish";
		stu2.sid = 102;
		stu2.sname="Kumar";
		stu3.sid = 103;
		stu3.sname="Rahul";
		stu4.sid = 104;
		stu4.sname="Aadi";
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);
		System.out.println(stu4);
		System.out.println(stu1 == stu2);
		System.out.println(stu1 == stu3);
		System.out.println(stu1 == stu4);

		Student stu5 = context.getBean(Student.class);
		

		System.out.println("Main Completed");

	}
}
