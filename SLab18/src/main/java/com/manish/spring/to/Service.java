package com.manish.spring.to;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Service {

	private Student stud;
	private Employee emp;

	public Service() {
		System.out.println("\n-- Service No Arg Cons --");
	}

	@Autowired
	public Service(@Qualifier("stud") Student stud1, @Qualifier("emp2") Employee emp1) {
		System.out.println("\n-- Service (Student,Employee)--");
		this.stud = stud1;
		this.emp = emp1;
	}

	public void setStud(Student stud) {
		System.out.println("-- Service.setStud --");
		this.stud = stud;
	}

	public void setEmp(Employee emp) {
		System.out.println("-- Service.setEmp --");
		this.emp = emp;
	}

	public void process() {
		System.out.println("\n-- Service.process --");
		System.out.println("Stud " + stud);
		System.out.println("Emp " + emp);
		if (stud != null) {
			stud.show();
		}
		if (emp != null) {
			emp.display();
		}
	}

}
