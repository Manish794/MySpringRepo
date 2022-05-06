package com.manish.spring.to;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {

	private Student stud;
	private Employee emp;

	public Service() {
		System.out.println("\n-- Service No Arg Cons --");
	}

	@Autowired(required = false)
	public void setStud(Student stud) {
		System.out.println("-- Service.setStud --");
		this.stud = stud;
	}

	@Autowired
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
