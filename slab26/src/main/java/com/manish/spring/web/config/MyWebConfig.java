package com.manish.spring.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
@ComponentScan("com.manish.spring")
public class MyWebConfig {
	@Bean
	public InternalResourceViewResolver viewResolver() {
		System.out.println("-- InternalResourceViewResolver registered");
		InternalResourceViewResolver viewResoler = new InternalResourceViewResolver();
		viewResoler.setViewClass(JstlView.class);
		viewResoler.setPrefix("/WEB-INF/pages/");
		viewResoler.setSuffix(".jsp");
		return viewResoler;
	}
}
