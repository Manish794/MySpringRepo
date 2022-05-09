package com.manish.spring.to;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DBDetails {
	@Value("${db.url}")
	private String url;
	@Value("${db.username}")
	private String username;
	@Value("${db.password}")
	private String password;
	@Value("${db.use.pool}")
	private boolean usePool;
	@Value("${db.connection.min: 10}")
	private int connectionMin;
	@Value("${db.connection.max: 20}")
	private int connectionMax;
	@Value("${db.connection.idle.timeout:3000}")
	private int connectionIdleTimeout;

	@Override
	public String toString() {
		return "DBDetails [url=" + url + ", username=" + username + ", password=" + password + ", usePool=" + usePool
				+ ", connectionMin=" + connectionMin + ", connectionMax=" + connectionMax + ", connectionIdleTimeout="
				+ connectionIdleTimeout + "]";
	}

}
