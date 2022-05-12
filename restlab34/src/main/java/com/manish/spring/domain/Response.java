package com.manish.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Response<T> {
	private ResponseStatus status = ResponseStatus.SUCCESS;
	private String errorMessage;
	private T data;

}
