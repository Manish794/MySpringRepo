package com.manish.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.manish.spring.to.AppDetails;
import com.manish.spring.to.DBDetails;

@Configuration
@PropertySource({ "classpath:manish-config.properties", "classpath:manish-db-config.properties" })
public class ManishConfig {

	@Autowired
	private Environment env;

	@Bean
	public DBDetails dbDetails() {
		DBDetails dbDetails = new DBDetails();
		dbDetails.setUrl(env.getProperty("db.url"));
		dbDetails.setUsername(env.getProperty("db.username"));
		dbDetails.setPassword(env.getProperty("db.password"));
		dbDetails.setUsePool(Boolean.valueOf(env.getProperty("db.use.pool")));
		dbDetails.setConnectionMin(Integer.parseInt(env.getProperty("db.connection.min")));
		dbDetails.setConnectionMax(Integer.parseInt(env.getProperty("db.connection.max")));
		dbDetails.setConnectionIdleTimeout(Integer.parseInt(env.getProperty("db.connection.idle.timeout", "3000")));
		return dbDetails;
	}

	@Bean
	public AppDetails appDetails() {
		AppDetails appDetails = new AppDetails();
		appDetails.setAppVersion(env.getProperty("app.version"));
		appDetails.setErrorEmail(env.getProperty("app.error.email"));
		appDetails.setLogLevel(env.getProperty("app.log.level"));
		return appDetails;
	}

}
