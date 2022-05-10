package com.manish.spring.service;

import org.springframework.stereotype.Component;

import com.manish.spring.domain.User;

@Component
public class UserService {
	public User validateUser(String uname, String pwd) {
		// JPA Code
		if (uname.equals(pwd)) {
			return User.builder().username(uname).build();
		}
		return null;
	}
}
