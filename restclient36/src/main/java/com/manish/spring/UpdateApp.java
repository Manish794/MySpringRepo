package com.manish.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manish.spring.client.domain.User;
import com.manish.spring.client.service.UserService;
import com.manish.spring.config.MyConfig;

public class UpdateApp {
	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		UserService userService = context.getBean(UserService.class);
		User user = new User();
		user.setUid("U-001");
		user.setFullName("M2");
		user.setEmail("m2@oits");
		user.setPhone(111112);
		user.setPassword("m2@0987");
		System.out.println("Updated "+userService.updateUser(user));
		context.registerShutdownHook();
		context.close();
	}

}