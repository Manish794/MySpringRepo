package com.manish.spring.controller;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "testkey", havingValue = "hello")
public class StudentService {
	public StudentService() {
		System.out.println("-- StudentService Def Cons --");
	}
}
