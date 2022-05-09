package com.manish.spring.to;

import lombok.ToString;

@ToString
public class Student {
	public int sid;
	public String sname;

	public Student() {
		System.out.println("** Student() Cons");
	}

}
