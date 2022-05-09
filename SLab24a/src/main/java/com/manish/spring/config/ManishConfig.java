package com.manish.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({
		"classpath:manish-config.properties", "classpath:manish-db-config.properties"})
@ComponentScan("com.manish.spring")
public class ManishConfig {


}
