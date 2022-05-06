package com.manish.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manish.spring.config.ManishConfig;
import com.manish.spring.to.Service;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ManishConfig.class);
		System.out.println("Spring Container is started");
		Service s1 = context.getBean("serv1", Service.class);
		s1.process();
		Service s2 = context.getBean("serv2", Service.class);
		s2.process();
		Service s3 = context.getBean("serv3", Service.class); 
		s3.process();
		Service s4 = context.getBean("serv4", Service.class); 
		s4.process();

		System.out.println("Main Completed");

	}
}
