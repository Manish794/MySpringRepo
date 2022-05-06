package com.manish.spring.p2;

public class Test1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1);

		s1 = s1.withSid(101);
		System.out.println(s1);
		s1 = s1.withName("Manish");
		System.out.println(s1);

		Student s2 = new Student().withSid(102).withName("Kumar").withEmail("kumar@gmail.com");
		System.out.println(s2);

		Student s3 = new Student().withName("Kumar").withPhone(87878787L);
		System.out.println(s3);

		String str = "abc";
		str = str.toUpperCase();
		str = str.substring(2);
		int x = str.length();

		int b = "abc".toUpperCase().substring(2).length();

	}
}
