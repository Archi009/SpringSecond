package com.yedam.board;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.yedam.board.service.BoardService;
import com.yedam.board.service.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/resources/spring/*-context.xml")
public class BoardServiceTest {
	
	@Setter(onMethod_ = @Autowired)
	private BoardService boardService;
	
	//@Test
	public void update() {
	BoardVO vo = boardService.get(1);
	vo.setTitle("제목바꿈요");
	  boardService.update(vo);
	}
	@Test
	public void del() {
		int no = boardService.del(2);
		System.out.println(no);
	}
	
}
