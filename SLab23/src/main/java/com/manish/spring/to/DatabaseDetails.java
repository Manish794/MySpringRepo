package com.manish.spring.to;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class DatabaseDetails {

	private String driverClass;
	private String url;
	private String username;
	private String password;
	private int port;

	@Autowired
	public DatabaseDetails(Environment env) {
		System.out.println("--DatabaseDetails Def Cons -- " + env);
		this.driverClass = env.getProperty("db.driverclass");
		this.url = env.getProperty("db.url"); 
		this.username = env.getProperty("db.username"); 
		this.password = env.getProperty("db.password");
		this.port = Integer.parseInt(env.getProperty("db.port"));
	}

	@Override
	public String toString() {
		return "DatabaseDetails [driverClass=" + driverClass + ", url=" + url + ", username=" + username + ", password="
				+ password + ", port=" + port + "]";
	}

}
