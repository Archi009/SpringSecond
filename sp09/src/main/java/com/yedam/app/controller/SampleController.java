package com.yedam.app.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.yedam.app.service.SampleService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class SampleController {
		
	private final SampleService service;
	
	@GetMapping("/")
	@ResponseBody 
	public String  getTime() {
		return service.getTime();
	}
	
	@GetMapping("/home")
	public String  home() {
		return "home";
	}
	
	@GetMapping("/uploadForm")
	public String uploadForm() {
		return "uploadForm";
	}
	
	@PostMapping("/uploadFormAction")
												//form 태그로 보낼 input의 name과 일치해야 인식한다
	public String uploadFormAction(@RequestPart("uploadFile") MultipartFile uploadFile,@RequestParam("desc") String str) throws IllegalStateException, IOException {
		System.out.println(str);
		System.out.println(uploadFile.getSize());
		System.out.println(uploadFile.getOriginalFilename());
		uploadFile.transferTo(new File("c:/upload",uploadFile.getOriginalFilename()));
		return "uploadForm";
	}
	
}
