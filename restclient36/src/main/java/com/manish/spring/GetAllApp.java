package com.manish.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manish.spring.client.service.UserService;
import com.manish.spring.config.MyConfig;

public class GetAllApp {
	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		UserService userService = context.getBean(UserService.class);
		System.out.println(userService.getAllUsers());
		context.registerShutdownHook();
		context.close();
	}
	
}