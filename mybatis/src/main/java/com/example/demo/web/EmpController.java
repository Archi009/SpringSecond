package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.EmpService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
@RequiredArgsConstructor
public class EmpController {
	 
	private final EmpService emp;
	
	@GetMapping("/emp")
	public String getList(Model model){
		model.addAttribute("empList",emp.getEmp());
		return "emp";
	}
	
	@GetMapping("/layout")
	public String getLayout(Model model){
		model.addAttribute("empList",emp.getEmp());
		return "layout";
	}
	
}
   