package com.manish.spring.to;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class DBDetails {

	private String driverClass;
	private String url;
	private String username;
	private String password;
	private int port;

	@Autowired
	private Environment env;
	
	public DBDetails() {
		System.out.println("--DBDetails Def Cons -- " + env);
	}

	@PostConstruct
	public void initData() {
		System.out.println("--@PostConstruct -> initData-- " + env);
		this.driverClass = env.getProperty("db.driverclass");
		this.url = env.getProperty("db.url"); 
		this.username = env.getProperty("db.username"); 
		this.password = env.getProperty("db.password");
		this.port = Integer.parseInt(env.getProperty("db.port"));
	}
	
	@Override
	public String toString() {
		return "DBDetails [driverClass=" + driverClass + ", url=" + url + ", username=" + username + ", password="
				+ password + ", port=" + port + "]";
	}

}
