package com.manish.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manish.spring.client.domain.Response;
import com.manish.spring.client.service.UserService;
import com.manish.spring.config.MyConfig;


public class DeleteAllApp {
	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		UserService userService = context.getBean(UserService.class);

		Response<Boolean> response = userService.deleteAllUser();
		System.out.println(response);
		System.out.println("Completed");
		context.registerShutdownHook();
		context.close();
	}

}