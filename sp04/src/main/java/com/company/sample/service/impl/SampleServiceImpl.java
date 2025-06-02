package com.company.sample.service.impl;

import org.springframework.stereotype.Service;

import com.company.sample.service.SampleService;

@Service
public class SampleServiceImpl implements SampleService {

	@Override
	public void sample(String name) {
		// TODO Auto-generated method stub
		
		System.out.println("서비스");
		
	}

}
