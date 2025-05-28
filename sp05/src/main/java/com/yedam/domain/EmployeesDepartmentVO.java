package com.yedam.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class EmployeesDepartmentVO {
	private int employeeId;
	private String firstName;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
	private Date hireDate;
	private Departments department;
}
