package com.manish.spring.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.manish.spring.domain.User;

@Component
public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(User.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		User user = (User)target;
		System.out.println("UserValidator -> validate " + user.getUsername() + "\t" + user.getPassword());
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "error.required", new Object[] { "Username" },
				"Username is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.required", new Object[] { "Password" },
				"Password is required");
	}

}
