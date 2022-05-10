package com.manish.spring.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "testapp", havingValue = "hello")
public class AppData {

	private AppData() {
		System.out.println("-- AppData Def --");
	}

}
