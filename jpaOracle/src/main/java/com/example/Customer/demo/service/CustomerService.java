package com.example.Customer.demo.service;

import java.util.List;

import com.example.Customer.demo.web.CustomerVO;

public interface CustomerService {
	
	
	//전체조회
	List<CustomerVO>findAll();
	//단건조회
	CustomerVO findById(Long id);
	//등록
	int insert(CustomerVO vo);
	//수정
	int update(CustomerVO vo);
	//삭제
	int del(Long id);
}
