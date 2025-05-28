package com.yedam.domain;

import java.util.List;

import lombok.Data;

@Data
public class EmployeesDepartmentListVO {
	private int employeeId;
	private String firstName;
	
	private List<Departments> department;
}
