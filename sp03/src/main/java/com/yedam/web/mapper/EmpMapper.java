package com.yedam.web.mapper;

import java.util.List;
import java.util.Map;

import com.yedam.web.model.Employees;
import com.yedam.web.model.SearchVO;

public interface EmpMapper {
	
	List<Employees> findAll(SearchVO search);
	List<Map> findAlltoMap();
	List <Employees> getCount(); // id값이 매서드 명, 매개변수 없음 // int Integer
	int insert(Employees employees);
	int update(Employees employees);
	int delete(int employeeId);
	List<Employees>findEmpDept();
}
