package com.manish.spring.p5;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
	private int sid;
	private String name;
	private String email;
	private long phone;

}
