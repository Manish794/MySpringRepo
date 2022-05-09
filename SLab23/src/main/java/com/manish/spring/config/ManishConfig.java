package com.manish.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.manish.spring.to.MyDBData;

@PropertySource({ "classpath:mydb.properties" })
@ComponentScan("com.manish.spring.to")
public class ManishConfig {

	@Autowired
	private Environment env;

	@Bean("myDbData1")
	public MyDBData myDbData() {
		MyDBData myDbData = new MyDBData();
		myDbData.setDriverClass(env.getProperty("db.driverclass"));
		myDbData.setUrl(env.getProperty("db.url"));
		myDbData.setUsername(env.getProperty("db.username"));
		myDbData.setPassword(env.getProperty("db.password"));
		myDbData.setPort(Integer.parseInt(env.getProperty("db.port")));
		return myDbData;
	}

}
