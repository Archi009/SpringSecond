package com.company.sample.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.sample.mapper.Sample1Mapper;
import com.company.sample.mapper.Sample2Mapper;
import com.company.sample.service.SampleTxService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class SampleTxServiceImpl implements SampleTxService {
	
	
	private final Sample1Mapper mapper1;

	private final Sample2Mapper mapper2;
	
	
	@Override
	@Transactional
	public void addData(String value) {
		mapper1.insertCol1(value); // 500
		mapper2.insertCol2(value); // 50
		
	}

}
