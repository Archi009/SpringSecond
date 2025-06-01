package com.yedam.board.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.board.service.Criteria;
import com.yedam.board.service.ReplyService;
import com.yedam.board.service.ReplyVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;




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
	@PutMapping
	public int modify(@PathVariable("bno") Long bno,@RequestBody ReplyVO vo) {
		vo.setBno(bno);
		log.info("ReplyVO"+ vo);
		int updateCount = service.modify(vo);
		log.info("update"+updateCount);
		return updateCount;
	}
	
	@DeleteMapping("/{rno}")
	public int delete(@PathVariable("bno") Long bno,@PathVariable("rno") Long rno ) {
		int deleteCount = service.remove(rno);
		log.info("del"+deleteCount);
		return deleteCount;
	}
	
	
}
