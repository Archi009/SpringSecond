package com.company.book.service;

import java.util.Date;

import lombok.Data;

@Data
public class RentVO {
	
	private int rent_no;
	private int book_no;
	private int rent_price;
	private Date rent_date;
	private String rent_status;
}
