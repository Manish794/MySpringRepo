package com.manish.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.manish.spring.to.MyDBData;

@PropertySource({ "classpath:mydb.properties" })
@ComponentScan("com.manish.spring.to")
public class ManishConfig {

	@Value("${db.driverclass}")
	private String driverClass;

	@Value("${db.url}")
	private String url;

	@Value("${db.username}")
	private String username;

	@Value("${db.password}")
	private String password;

	@Value("${db.port}")
	private int port;

	@Bean("myDbData1")
	public MyDBData myDbData() {
		MyDBData myDbData = new MyDBData();
		myDbData.setDriverClass(driverClass);
		myDbData.setUrl(url);
		myDbData.setUsername(username);
		myDbData.setPassword(password);
		myDbData.setPort(port);
		return myDbData;
	}

}
