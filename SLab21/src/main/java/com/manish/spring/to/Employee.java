package com.manish.spring.to;

import lombok.ToString;

@ToString
public class Employee {
	public int eid;
	public String ename;

	public Employee() {
		System.out.println("^^ Employee() Cons");
	}

}
