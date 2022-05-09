package com.manish.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manish.spring.config.ManishConfig;
import com.manish.spring.to.MyMessage;

public class SApp2 {
	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ManishConfig.class);
		System.out.println("-- Spring Container is Ready --\n");

		MyMessage oitsMessage = context.getBean(MyMessage.class);
		oitsMessage.showMessage("en");
		oitsMessage.showMessage("hi");

		context.registerShutdownHook();
	}

}
