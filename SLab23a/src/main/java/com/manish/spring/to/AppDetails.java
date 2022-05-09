package com.manish.spring.to;

public class AppDetails {
	private String errorEmail;
	private String logLevel;
	private String appVersion;

	public String getErrorEmail() {
		return errorEmail;
	}

	public void setErrorEmail(String errorEmail) {
		this.errorEmail = errorEmail;
	}

	public String getLogLevel() {
		return logLevel;
	}

	public void setLogLevel(String logLevel) {
		this.logLevel = logLevel;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	@Override
	public String toString() {
		return "AppDetails [errorEmail=" + errorEmail + ", logLevel=" + logLevel + ", appVersion=" + appVersion + "]";
	}

	
	
}
