package com.manish.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component
@Data
@ToString
@ConfigurationProperties(prefix = "db")
public class DBData {
	private String url;
	private String username;
	private String password;
	private String useMysql;

}
