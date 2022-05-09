package com.manish.spring.to;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class HelloProcessor implements BeanPostProcessor {
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("-- postProcessAfterInitialization --");
		return null;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("-- postProcessBeforeInitialization --");
		return null;
	}

}
