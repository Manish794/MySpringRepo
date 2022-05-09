package com.manish.spring.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manish.spring.config.ManishConfig;
import com.manish.spring.to.DBDetails;
import com.manish.spring.to.DatabaseDetails;
import com.manish.spring.to.MyDBData;

public class Test {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ManishConfig.class);
		System.out.println("\n******* Spring Container is started");

		MyDBData dbData = context.getBean("myDbData1",MyDBData.class);
		System.out.println(dbData);
		
		DatabaseDetails database = context.getBean(DatabaseDetails.class);
		System.out.println(database);
		
		DBDetails dbDetail = context.getBean(DBDetails.class);
		System.out.println(dbDetail);
		System.out.println("Main Completed");

	}
}
