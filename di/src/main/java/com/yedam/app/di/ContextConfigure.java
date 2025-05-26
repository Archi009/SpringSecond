package com.yedam.app.di;

import org.springframework.context.annotation.Bean;

// 자바 기반 설정
public class ContextConfigure {
	
	@Bean
	public Speaker speaker() {
		return new AppleSpeaker();
	}
	
	// 생성자 방식
	@Bean
	public TV stv() {
		return new SamsungTV(speaker());
	}
	
	// setter 방식
	@Bean
	public TV tv() {
		TV tv = new LgTV();
		tv.setSpeaker(speaker());
		return tv;
	}
}
