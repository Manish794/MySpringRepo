package com.manish.spring.app;

import com.manish.spring.to.Employee;

public class CoreTest {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = emp1;
		Employee emp3 = emp1;

		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		emp1.eid = 1001;
		emp1.ename = "Manish";
		emp2.eid = 1002;
		emp2.ename = "Kumar";
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);

	}

}
