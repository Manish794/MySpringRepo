package com.manish.spring.p5;

public class Test1 {
	public static void main(String[] args) {

		Student s1 = Student.builder().sid(103).phone(878787L).name("Kumar").build();
		System.out.println(s1);

	}
}
