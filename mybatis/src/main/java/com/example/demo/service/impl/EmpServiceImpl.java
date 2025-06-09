package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.EmpMapper;
import com.example.demo.service.EmpService;
import com.example.demo.service.EmpVO;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired EmpMapper mapper;
	
	@Override
	public List<EmpVO> getEmp() {
		// TODO Auto-generated method stub
		return mapper.getEmp();
	}

}
