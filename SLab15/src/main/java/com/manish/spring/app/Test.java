package com.manish.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manish.spring.config.ManishConfig;
import com.manish.spring.to.Service;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ManishConfig.class);
		System.out.println("Spring Container is started");
		Service s1 = context.getBean(Service.class);
		s1.process();

		System.out.println("Main Completed");

	}
}
