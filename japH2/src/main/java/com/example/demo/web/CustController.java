package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.repository.CustomerRepository;

@Controller
public class CustController {
	
	@Autowired CustomerRepository cus;
	
	@GetMapping("/cus")
	public String findAll(Model model) {
		
		model.addAttribute("cust", cus.findAll());
		
		return "cust";
	}
	
	
	
}
