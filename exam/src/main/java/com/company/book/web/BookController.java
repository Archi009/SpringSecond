package com.company.book.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.company.book.service.BookService;
import com.company.book.service.BookVO;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping("/book/*")
@RequiredArgsConstructor
public class BookController {
	
	final BookService service;
	
	
	@GetMapping("/list")
	public String getBookList(Model model) {
			
			model.addAttribute("list",service.getBookList());
		
		return "booklist";
	}
	@GetMapping({"/home","/"})
	public String goToHome() {
		return "/home";
	}
	@GetMapping("/reg")
	public String goToReg(Model model) {
		model.addAttribute("bookno",service.getBookNo());
		return"/bookreg";
	}
	@PostMapping("/reg")
	@ResponseBody
	public int reg(Model model, BookVO vo) {
		log.info(vo);
		return service.regBook(vo);
	}
	@GetMapping("/rent")
	public String rent(Model model) {
		model.addAttribute("list", service.getRent());
		return "/bookrent";
	}

}
