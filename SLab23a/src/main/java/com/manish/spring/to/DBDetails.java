package com.manish.spring.to;

public class DBDetails {
	private String url;
	private String username;
	private String password;
	private boolean usePool;
	private int connectionMin;
	private int connectionMax;
	private int connectionIdleTimeout;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isUsePool() {
		return usePool;
	}

	public void setUsePool(boolean usePool) {
		this.usePool = usePool;
	}

	public int getConnectionMin() {
		return connectionMin;
	}

	public void setConnectionMin(int connectionMin) {
		this.connectionMin = connectionMin;
	}

	public int getConnectionMax() {
		return connectionMax;
	}

	public void setConnectionMax(int connectionMax) {
		this.connectionMax = connectionMax;
	}

	public int getConnectionIdleTimeout() {
		return connectionIdleTimeout;
	}

	public void setConnectionIdleTimeout(int connectionIdleTimeout) {
		this.connectionIdleTimeout = connectionIdleTimeout;
	}

	@Override
	public String toString() {
		return "DBDetails [url=" + url + ", username=" + username + ", password=" + password + ", usePool=" + usePool
				+ ", connectionMin=" + connectionMin + ", connectionMax=" + connectionMax + ", connectionIdleTimeout="
				+ connectionIdleTimeout + "]";
	}

}
