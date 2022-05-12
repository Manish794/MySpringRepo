package com.manish.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manish.spring.client.domain.User;
import com.manish.spring.client.service.UserService;
import com.manish.spring.config.MyConfig;

public class AddApp {
	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		UserService userService = context.getBean(UserService.class);

		User user = new User();
		user.setFullName("Manish");
		user.setEmail("manish@gmail.com");
		user.setPhone(12121212);
		user.setPassword("manish@0988");
		
		
		System.out.println("Added " + userService.addUser(user));
		context.registerShutdownHook();
		context.close();
	}
}