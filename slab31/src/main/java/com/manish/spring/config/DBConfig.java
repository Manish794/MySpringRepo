package com.manish.spring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
import lombok.ToString;

@Configuration
@ConfigurationProperties("db")
@Data
@ToString
public class DBConfig {

	private String url;
	private String username;
	private String password;
	private String useMysql;
	private String xyz;

}
