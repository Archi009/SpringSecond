package com.yedam.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.web.mapper.TimeMapper;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/datasource-context.xml",
	                    "classpath:/spring/mybatis-context.xml"})
public class TimeMapperTest {
	
//	private static final Logger logger = LoggerFactory.getLogger(TimeMapperTest.class);
	
	@Setter(onMethod_ = {@Autowired})
	TimeMapper timeMapper;
	
	@Test
	public void getTime() {
		log.info(timeMapper.getTime());
	}
	
	@Test
	public void getTime2() {
		System.out.println(timeMapper.getTime2());
	}
}
