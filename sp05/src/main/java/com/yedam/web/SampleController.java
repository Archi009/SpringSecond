package com.yedam.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.domain.Employees;
import com.yedam.domain.EmployeesDepartmentListVO;
import com.yedam.domain.EmployeesDepartmentVO;
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
	
	@PostMapping("/ex06")
	public String ex06(@RequestBody List<EmployeesDepartmentListVO> entity) {
		System.out.println(entity);
		
		return "main";
	}
	@PostMapping("/ex07")
	public String ex06(@RequestBody EmployeesDepartmentVO entity) {
		
		System.out.println(entity);
		
		return "main";
	}
	@GetMapping("/ex08")
	@ResponseBody
	public SampleVO ex08(SampleVO sample) {
		return sample;
	}
	
	@PostMapping("/ex09")
	@ResponseBody //Ajax 호출의 수신을 위한 어노테이션
	public SampleVO ex09(@RequestBody SampleVO sample) { // 매개변수에 @RequestBody 가 있다면 무조건 데이터는 JSON 방식으로 가야한다
		return sample;
	}
	
	@GetMapping("/ex10")
	@ResponseBody  // ResponseBody  가 있다면 내가 return 하는것은 페이지로 연동되어 가는게 아니라 값만 보낸다!!!!!
	public String ex10 () {
		return "main";
	}
	
	@GetMapping("ex11")
	public String ex11(Model model) {
		model.addAttribute("name","홍길동"); //redirect를 사용하면 내가 지정한 속성은 요청과 함께 삭제된다. 이를 방지하기위해 RedirectAttributes를 사용한다.
		return "redirect:ex01";
	}
	
	@GetMapping("ex12")
	public String ex12(Model model, RedirectAttributes rttr) {
		rttr.addFlashAttribute("msg","휘발성파라미터"); // Flash는 새로고침시 사라짐
		rttr.addAttribute("name","홍길동");  //=> ?name="홍길동" 같은 형식으로 바꿔주는형식
		return "redirect:ex01";
	}
}
