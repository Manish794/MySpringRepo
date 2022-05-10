package com.manish.spring.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!dev")
public class MyData {

	private MyData() {
		System.out.println("-- MyData Def --");
	}

}
