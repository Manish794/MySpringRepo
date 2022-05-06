package com.manish.spring.p1;

public class Test1 {
	public static void main(String[] args) {
		Student s1 = new Student(101,"Manish","manish@gmail.com",98989898L);
		System.out.println(s1);
		
		Student s2 = new Student();
		s2.setSid(102);
		
		System.out.println(s2);
		
		Student s3 = new Student();
		s2.setEmail("kumar@gmail.com");
		System.out.println(s3);
		
	}
}
