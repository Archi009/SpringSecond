package com.yedam.web;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/emp")
@Controller  //component 상속받아 만들어짐 : 컴트롤러화, 빈등록 
public class EmpController {
	
	@GetMapping("/empList")
	public String empList(Model model) {	
		model.addAttribute("servertime",new Date());
		return "empList";	//forward
	

		
};
}
