package com.manish.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.test.spring.domain.Student;

@Controller
public class TestController {

	@Autowired
	private Student stud;

}
