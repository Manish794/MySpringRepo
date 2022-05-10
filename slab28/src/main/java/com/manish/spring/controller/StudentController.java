package com.manish.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manish.spring.domain.Student;

@Controller
public class StudentController {

	@ResponseBody
	@RequestMapping(value = "/getstudent/{sid}", method = RequestMethod.GET)
	public Student searchStudent(@PathVariable("sid") String studId) {
		System.out.println("/searchStudent executed");
		Student st = Student.builder().studId(studId).name("Manish").email(studId + "@gmail.com").build();
		return st;
	}
}
