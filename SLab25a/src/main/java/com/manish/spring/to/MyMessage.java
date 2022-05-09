package com.manish.spring.to;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyMessage {

	@Autowired
	private ApplicationContext context;

	public void showMessage(String languageCode) {
		System.out.println("\n-- showMessage -- " + languageCode);
		Locale locale = new Locale(languageCode);
		String hiMsg = context.getMessage("person.name", null, locale);
		System.out.println("Name : " + hiMsg);
		String unmRequired = context.getMessage("field.required", new Object[] { "Username" }, locale);
		System.out.println("Username Required : " + unmRequired);
		String unmLength = context.getMessage("field.length", new Object[] { "Username", 8, 20 }, locale);
		System.out.println("Username Length: " + unmLength);
	}
}
