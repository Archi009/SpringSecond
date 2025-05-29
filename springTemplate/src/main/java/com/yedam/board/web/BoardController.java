package com.yedam.board.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.board.service.BoardService;
import com.yedam.board.service.BoardVO;
import com.yedam.board.service.Criteria;
import com.yedam.board.service.PageDTO;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
/**
 *  @author 욱
 *  @since  2025/05/28
 *  @category CRUD
 *  
 */
@Controller
@Log4j2
@RequestMapping("/board/*")
@RequiredArgsConstructor
public class BoardController {
	
	final BoardService boardService;
	
	/**
	 * 게시글 목록
	 * @param model : 검색
	 * @return
	 */
	@GetMapping("/list")
	public String getMathodName(Criteria cri, Model model) {
		
		model.addAttribute("list",boardService.getList(cri));
		//paing 처리
				long total = boardService.getTotalCount(cri);
				model.addAttribute("pageMaker", new PageDTO(cri, total));
		return "board/list"; 
	}
	
	/**
	 * 등록페이지이동
	 * @return
	 */
	@GetMapping("/register")
	public String goToInsert() {
		
		return "board/register";
	}
	
	/**
	 * 
	 * @param vo 등록 정보
	 * @return 여부
	 */
	@PostMapping("/register")
	public String insert(BoardVO vo , RedirectAttributes rttr) {
		
		int res = boardService.insert(vo);
		rttr.addFlashAttribute("result",vo.getBno());
		if(res > 0) {
		return "redirect:list";
		}else {
			return "fail";
		
		}
	}
	
	// 단건조회
	@GetMapping("/get")
	public String get(@RequestParam("bno") String bno,Model model) {
		model.addAttribute("board", boardService.get(Integer.parseInt(bno)));
		return "/board/get";
		
	}
	
	//수정페이지 이동
	@GetMapping("/update")
	public String goToUpdate(@RequestParam("bno") String bno, Model model) {
		model.addAttribute("board",boardService.get(Integer.parseInt(bno)));
		return "/board/update";
	}
	
	// 삭제
	@PostMapping("/del")
	@ResponseBody
	public String del (@RequestBody long bno ) {
		
		if(boardService.del(bno) >0) {
			
			return "{\"res\":\"success\"}";
		}else {
			return "{\"res\":\"false\"}";
		}
	}
	
	// 수정
	@PostMapping("/update")
	public String update (BoardVO vo) {
		if(boardService.update(vo)>0) {
			return "redirect:list";
		}else {
			return "false";
		}
	}
	
}
