package com.manish.spring.app;

import com.manish.spring.to.Employee;
import com.manish.spring.to.Student;

public class Test {
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setSid(101);
		st1.setSname("Manish");

		st1.show();

		Student st2 = new Student(102, "Kumar");
		st2.show();

		Employee e1 = new Employee();
		e1.setEid(1001);
		e1.setEname("Rahul");
		e1.display();

		Employee e2 = new Employee(1002, "Aadi");
		e2.display();

	}
}
