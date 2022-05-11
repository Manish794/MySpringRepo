package com.manish.spring.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Response {
	private String status ="SUCCESS";
	private String errorMessage;
	private Student student;
	private List<Student> students;

}
