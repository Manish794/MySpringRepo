package com.manish.spring.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manish.spring.config.ManishConfig;
import com.manish.spring.to.AppDetails;
import com.manish.spring.to.DBDetails;

public class SApp {
	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ManishConfig.class);
		System.out.println("-- Spring Container is Ready --\n");

		DBDetails dbDetails = context.getBean(DBDetails.class);
		System.out.println(dbDetails);
		AppDetails appDetails = context.getBean(AppDetails.class);
		System.out.println(appDetails);
		context.registerShutdownHook();
	}

}
