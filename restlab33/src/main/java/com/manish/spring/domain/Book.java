package com.manish.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	private String bookId;
	private String bname;
	private String author;
	private String publication;
	private float price;

}
