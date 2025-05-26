package com.yedam.web.model;

import java.util.List;

import lombok.Data;

@Data
public class SearchVO extends Employees {
	int page;
	List<Integer> ids;
}
