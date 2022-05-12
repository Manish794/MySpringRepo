package com.manish.spring;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.manish.spring.client.domain.User;

public class Main {
	public static void main(String[] args)throws Exception {
			User user = User.builder()
					.uid("U-101")
					.fullName("Manish")
					.email("manish@gmail.com")
					.phone(989898L)
					.password("manish@123")
					.build();
			
			ObjectMapper objectMapper = new ObjectMapper();
			String str = objectMapper.writeValueAsString(user);
			System.out.println(str);
			
	}
}
