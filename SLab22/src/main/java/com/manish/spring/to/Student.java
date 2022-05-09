package com.manish.spring.to;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import lombok.ToString;

@ToString
public class Student implements InitializingBean, DisposableBean, BeanNameAware, ApplicationContextAware {
	public int sid;
	public String sname;

	public Student() {
		System.out.println("** Student() Cons");
	}

	@PostConstruct
	public void createConnection() {
		System.out.println("-- createConnection --");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("-- afterPropertiesSet --");
	}
	public void setBeanName(String name) {
		System.out.println("-- setBeanName -- " + name);
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("-- setApplicationContext -- ");
	}
	public void readData() {
		System.out.println("-- readData --");
	}

	
	@PreDestroy
	public void cloneConnection() {
		System.out.println("-- cloneConnection --");
	}

	public void destroy() throws Exception {
		System.out.println("-- destroy --");
	}
	public void updateData() {
		System.out.println("-- updateData --");
	}

	

}
