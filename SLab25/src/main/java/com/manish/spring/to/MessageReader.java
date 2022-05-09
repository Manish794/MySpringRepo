package com.manish.spring.to;

import java.util.Locale;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class MessageReader implements ApplicationContextAware {

	private ApplicationContext context;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
	}

	public void readMessage(String languageCode) {
		String unmRequired = context.getMessage("errors.required", new Object[] { "Username" },
				new Locale(languageCode));
		System.out.println(unmRequired);

		String pwdRequired = context.getMessage("errors.required", new Object[] { "Password" },
				new Locale(languageCode));
		System.out.println(pwdRequired);

		String emlRequired = context.getMessage("errors.required", new Object[] { "Email" }, new Locale(languageCode));
		System.out.println(emlRequired);

	}

}
