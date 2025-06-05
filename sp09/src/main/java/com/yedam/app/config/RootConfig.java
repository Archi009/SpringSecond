package com.yedam.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//설정파일!!! 
@Configuration
@EnableAspectJAutoProxy //AOP 의 aspectJ 사용을 위한 설정
@ComponentScan(basePackages = {"com.yedam"}) //원래는 아래처럼 하나하나 bean 등록해야하지만 스캔을 설정함으로서 원하는 클래스에 component 어노테이션만 넣으면 알아서 다 스캔해서 bean 등록해준다.
public class RootConfig {
		
	
//	// root-context에서 모든 class를  scan 하던걸 자바 class로 설정한것.
//	@Bean //bean 등록 어노테이션
//	public Chef chef() {
//		return new Chef();
//	}
//	
//	@Bean
//	public Restaurant restaurant() {
//		return new Restaurant(chef());
//	}
	
}
	