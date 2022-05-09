package com.manish.spring.to;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppDetails {
	@Value("${app.error.email}")
	private String errorEmail;
	@Value("${app.log.level}")
	private String logLevel;
	@Value("${app.version}")
	private String appVersion;

	@Override
	public String toString() {
		return "AppDetails [errorEmail=" + errorEmail + ", logLevel=" + logLevel + ", appVersion=" + appVersion + "]";
	}

}
