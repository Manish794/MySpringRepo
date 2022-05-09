package com.manish.spring.to;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class MyDBData {
	private String driverClass;
	private String url;
	private String username;
	private String password;
	private int port;
	
}
