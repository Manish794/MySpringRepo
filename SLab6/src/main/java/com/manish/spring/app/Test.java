package com.manish.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manish.spring.to.Service;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("manish-spring-config.xml");
		System.out.println("Spring Container is started");

		Service serv1 = context.getBean("s1", Service.class);
		serv1.process();

		System.out.println("Main Completed");

	}
}
