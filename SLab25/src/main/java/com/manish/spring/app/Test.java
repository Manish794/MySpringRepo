package com.manish.spring.app;

import java.util.Locale;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manish.spring.config.ManishConfig;

public class Test {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ManishConfig.class);
		System.out.println("\n******* Spring Container is started");

		String owner = context.getMessage("app.owner", null, null);
		System.out.println(owner);
		String hindiOwnerName = context.getMessage("app.owner", null, new Locale("hi"));
		System.out.println(hindiOwnerName);

		String required = context.getMessage("errors.required", null, null);
		System.out.println(required);
		String hindiErrors = context.getMessage("errors.required", null, new Locale("hi"));
		System.out.println(hindiErrors);

		String unmRequired = context.getMessage("errors.required", new Object[] { "Username" }, null);
		System.out.println(unmRequired);
		String hindiUnmErrors = context.getMessage("errors.required", new Object[] { "उपयोगकर्ता नाम" },
				new Locale("hi"));
		System.out.println(hindiUnmErrors);

		String pwdRequired = context.getMessage("errors.required", new Object[] { "Password" }, null);
		System.out.println(pwdRequired);
		String hindiPwdErrors = context.getMessage("errors.required", new Object[] { "पासवर्ड" }, new Locale("hi"));
		System.out.println(hindiPwdErrors);

		String emlRequired = context.getMessage("errors.required", new Object[] { "Email" }, null);
		System.out.println(emlRequired);
		String hindiEmlErrors = context.getMessage("errors.required", new Object[] { "ईमेल" }, new Locale("hi"));
		System.out.println(hindiEmlErrors);

		System.out.println("Main Completed");

	}
}
