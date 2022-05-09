package com.manish.spring.to;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.ToString;

@ToString
public class Student {
	public int sid;
	public String sname;

	public Student() {
		System.out.println("** Student() Cons");
	}

	@PostConstruct
	public void createConnection() {
		System.out.println("-- createConnection --");
	}

	@PreDestroy
	public void cloneConnection() {
		System.out.println("-- Closing the connection from DB/File --");
	}

}
