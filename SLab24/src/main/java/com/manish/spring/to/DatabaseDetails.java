package com.manish.spring.to;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class DatabaseDetails {

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

	public DatabaseDetails() {
		System.out.println("--DatabaseDetails Def Cons -- ");

	}

	@Override
	public String toString() {
		return "DatabaseDetails [driverClass=" + driverClass + ", url=" + url + ", username=" + username + ", password="
				+ password + ", port=" + port + "]";
	}

}
