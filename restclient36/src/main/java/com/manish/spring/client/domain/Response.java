package com.manish.spring.client.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Response<T> {
	private Status status = Status.SUCCESS;
	private String errorMessage;
	private T data;

}
