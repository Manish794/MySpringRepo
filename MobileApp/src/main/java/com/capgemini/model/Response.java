package com.capgemini.model;

import lombok.Data;

@Data
public class Response<T> {
	private T data;
	private String status;
	private AppError error;

	public String getStatus() {
		return error != null ? "ERROR" : "SUCCESS";
	}

}
