package com.manish.spring.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
	private String studId;
	private String name;
	private String email;

}
