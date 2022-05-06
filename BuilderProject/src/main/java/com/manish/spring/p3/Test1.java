package com.manish.spring.p3;

import com.manish.spring.p3.Student.StudentBuilder;

public class Test1 {
	public static void main(String[] args) {

		StudentBuilder builder = Student.builder();
		builder.sid(101);
		builder.phone(87878787);

		Student s1 = builder.build();
		System.out.println(s1);

		Student s2 = Student.builder().sid(102).phone(999999L).build();
		System.out.println(s2);

	}

}
