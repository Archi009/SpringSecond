package com.yedam.app.annotation;

import org.springframework.stereotype.Component;

import com.scan.BoardService;

import lombok.RequiredArgsConstructor;

//2. 생정자 주입
@RequiredArgsConstructor
@Component("tv")
public class SamsungTV implements TV {
	
	// 1. 필드 주입 방법
	// @Autowired
	// 3. setter 방식
	// @Setter(onMethod_= {@Autowired})
	private final Speaker speaker;// NullPointerError new
	

	public void powerOn() {
		System.out.println("SamsungTV powerOn");
	}

	public void powerOff() {
		System.out.println("SamsungTV powerOff");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}
}
