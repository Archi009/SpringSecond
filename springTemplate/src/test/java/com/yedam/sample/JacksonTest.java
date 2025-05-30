package com.yedam.sample;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yedam.sample.web.SampleVO;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class JacksonTest {
	//Jackson의 파싱 테스트
	
	
	@Test
	public void toStr() throws JsonProcessingException {
		SampleVO sample = new SampleVO(10,"길동","홍","1111");
		
		ObjectMapper om = new ObjectMapper();
		String str = om.writeValueAsString(sample);
		log.info(str);
		
		String param = "{\"mno\":10,\"firstName\":\"길동\",\"lastName\":\"홍\"}";
		SampleVO result = om.readValue(param, SampleVO.class);
		log.info(result);
	}
}
