package com.manish.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manish.spring.client.domain.Response;
import com.manish.spring.client.domain.User;
import com.manish.spring.client.service.UserService;
import com.manish.spring.config.MyConfig;

public class GetByIdApp {
	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		UserService userService = context.getBean(UserService.class);

		Response<User> response = userService.getUserById("U-001");
		System.out.println("Data Found :" + response);
		context.registerShutdownHook();
		context.close();
	}

}