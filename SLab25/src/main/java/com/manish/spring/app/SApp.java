package com.manish.spring.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manish.spring.config.ManishConfig;
import com.manish.spring.to.MessageReader;

public class SApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ManishConfig.class);
		System.out.println("\n******* Spring Container is started");
		
		MessageReader reader =  context.getBean(MessageReader.class);
		reader.readMessage("en");
		
		
		reader.readMessage("hi");
		
		
	}
}
