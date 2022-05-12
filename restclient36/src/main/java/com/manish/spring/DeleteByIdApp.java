package com.manish.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manish.spring.client.service.UserService;
import com.manish.spring.config.MyConfig;


public class DeleteByIdApp {
	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		UserService userService = context.getBean(UserService.class);

		userService.deleteUserById("U-003");
		System.out.println("Completed");
		context.registerShutdownHook();
		context.close();
	}

}