package com.example.demo.service;

import java.util.Date;

import lombok.Data;

@Data
public class EmpVO {
	private String employeeId;
	private String firstName;
	private String lastName;
	private String jobId;
	private String email;
	private String phoneNumber;
	private Date hireDate;
	private int	salary;
	private long commissionPct;
	private String managerId;
	private String departmentId;
}
