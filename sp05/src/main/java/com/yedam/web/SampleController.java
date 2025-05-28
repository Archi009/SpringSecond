package com.yedam.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.yedam.domain.Employees;
import com.yedam.domain.SampleVO;



@Controller
public class SampleController {
	
	@GetMapping("ex01")
	public String ex01(SampleVO sample,Model model) {
		System.out.println(sample);
		model.addAttribute("dept", "개발");
		System.out.println(model);
		return "main";
	}
	 
	@GetMapping("/ex02")
	public String ex02(@RequestParam(name = "name") String name,
						@RequestParam(name="age", defaultValue = "20",required = false) int age) {
		System.out.println(name);
		System.out.println(age);
		return  "main";
	}
	@GetMapping("/ex02List")
	public String ex02List(@RequestParam("hobby") List<String> param) {
		System.out.println(param);
		return "main";
	}
	
	@GetMapping("/ex03/{class}/{stdno}")
	public String getMethodName(@PathVariable("class") int classes,
								@PathVariable("stdno") int stdno) {
		System.out.println(classes);
		System.out.println(stdno);
		return "main";
	}
	@PostMapping("/ex04")
	public String ex04(@RequestBody SampleVO sample) {
		System.out.println(sample);
		return "main";
	}
	
	@PostMapping("/ex05")
	public String ex05(@RequestBody Employees entity) {
		//TODO: process POST request
		System.out.println(entity);
		return "main";
	}
	
	
}
