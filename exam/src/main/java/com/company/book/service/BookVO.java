package com.company.book.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class BookVO {
	
	private int book_no;
	private String book_name;
	private String book_coverimg;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date book_date;
	private String book_price;
	private String book_publisher;
	private String book_info;
	
	private RentVO rent;
}
