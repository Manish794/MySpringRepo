package com.manish.spring.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
import lombok.ToString;

@Configuration
@ConfigurationProperties("myserver")
@Data
@ToString
public class IPConfig {

	private List<String> ip;

	
}
