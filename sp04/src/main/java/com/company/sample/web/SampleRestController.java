package com.company.sample.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController //@ResponseBody 포함 
public class SampleRestController {
		
	@GetMapping("/api")
	public String getSample() {
		return "home";
	}
	

	
}
