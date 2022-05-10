package com.manish.spring.app;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.manish.spring.web.config.MyWebConfig;

public class MyAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("-- getRootConfigClasses");
		return new Class[] { MyWebConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("-- getServletConfigClasses");
		return null;
	}
	@Override
	protected String[] getServletMappings() {
		System.out.println("-- getServletMappings");
		return new String[] { "/" };
	}
}

