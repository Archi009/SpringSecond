package com.company.security;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.extern.log4j.Log4j2;
@Log4j2
public class PasswordTest {
	
	// Bcrypt 암호화를 통한 비밀번호 암호화 후 matches 메소드를 통해 일치 확인  equals나 === 로 비교 불가
	@Test
	public void test() {
		String rawPw = "1234";
		// Create an encoder with strength 16 : 암호화 스트랭스
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);
		String result = encoder.encode(rawPw);
		log.info("endcoded :   " + result);
		// assert???
		assertTrue(encoder.matches(rawPw, result));
//		assertEquals(rawPw, result); // assert =  method 의 결과를 확인하는 함수
	}
	
	
	
}
