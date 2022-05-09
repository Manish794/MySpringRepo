package com.manish.spring;

import java.util.Locale;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manish.spring.config.ManishConfig;

public class SApp {
	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ManishConfig.class);
		System.out.println("-- Spring Container is Ready --\n");

		String defMsg = context.getMessage("person.name", null, null);
		System.out.println("Default : " + defMsg);

		String enMsg = context.getMessage("person.name", null, new Locale("en"));
		System.out.println("English : " + enMsg);

		String hiMsg = context.getMessage("person.name", null, new Locale("hi"));
		System.out.println("Hindi : " + hiMsg);

		String fieldRequired = context.getMessage("field.required", null, new Locale("en"));
		System.out.println("Field Required : " + fieldRequired);

		String unmRequired = context.getMessage("field.required", new Object[] { "Username" }, new Locale("en"));
		System.out.println("Username Required : " + unmRequired);

		String pwdRequired = context.getMessage("field.required", new Object[] { "Password" }, new Locale("en"));
		System.out.println("Password Required : " + pwdRequired);

		String unmLength = context.getMessage("field.length", new Object[] { "Username", 8, 20 }, new Locale("en"));
		System.out.println("Username Length: " + unmLength);

		String pwdLength = context.getMessage("field.length", new Object[] { "Password", 7, 13 }, new Locale("en"));
		System.out.println("Password Length : " + pwdLength);

		context.registerShutdownHook();
	}

}
