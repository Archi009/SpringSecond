package com.yedam.app.di;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 캡슐화
// @Data
@Setter
@Getter
@ToString
@AllArgsConstructor
// @NoArgsConstructor
@RequiredArgsConstructor
public class Employee {
	
	private final String fname;
	private String lname;
	private final int salary;
	
	
}
