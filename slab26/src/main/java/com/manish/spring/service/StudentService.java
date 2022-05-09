package com.manish.spring.service;

import org.springframework.stereotype.Component;

import com.manish.spring.domain.Student;

@Component
public class StudentService {

	public Student searchStudent(String studId) {
		if (null == studId) {
			return null;
		} else
			return Student.builder().studId(studId).name("Manish").email(studId + "@gmail.com").build();

	}

}
