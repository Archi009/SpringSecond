package com.company.sample.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.company.sample.service.SampleService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RequiredArgsConstructor
@Controller
public class SampleController{
	
	private final SampleService service;
	
	@GetMapping("/")
	public String main() {
		service.sample("D"); // sample메소드가 호출 될 때 Advice가 출력 되면 된다.
		return "home";
	}
	
	
	@GetMapping({"/all","/member","/admin","/accessError","/login"})
	public void all(HttpServletRequest req) {
		System.out.println(req.getRequestURI());
	}
	
	
	
	
//	@GetMapping("/error")
//	public String AOPtest() {
//		int i= 5/0;
//		return "home";
//	}
	
}
