package com.yedam.app.service.Impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yedam.app.mapper.TimeMapper;
import com.yedam.app.service.SampleService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SampleServiceImpl implements SampleService {
	
	private final TimeMapper mapper;
	
	@Transactional //트랜젝션 설정 적용
	@Override
	public String getTime() {
		return mapper.getTime2();
	}

}
