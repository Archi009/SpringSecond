package com.yedam.board.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.board.service.Criteria;
import com.yedam.board.service.ReplyPageDTO;
import com.yedam.board.service.ReplyService;
import com.yedam.board.service.ReplyVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@Log4j2
@RestController
@AllArgsConstructor
@RequestMapping("/board/{bno}/replies")

public class ReplyContoller {
	
	private ReplyService service;
	
	//조회
	@GetMapping("")
	public  List<ReplyVO> getList(
//			@RequestParam("page") int page,
			@PathVariable("bno") Long bno
			){
		Criteria cri = new Criteria();
		cri.setAmount(10);
		cri.setPageNum(1);
		return service.getList(cri,bno);
	}
	
	
	@PostMapping("")
	public ResponseEntity<ReplyVO> create(@PathVariable("bno") Long bno,@RequestBody ReplyVO vo) {
		//TODO: process POST request
		ResponseEntity<ReplyVO> result = null;
		vo.setBno(bno);
		log.info("ReplyVO:"+ vo);
		int insertCount = service.register(vo);
		log.info("Reply INSERT COUNT:"+insertCount);
		
		if(insertCount ==1 ) {
			result=ResponseEntity.status(HttpStatus.OK).body(vo);
		}else {
			result=ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(vo);
			
		}
		return result;
	}
	
	
}
