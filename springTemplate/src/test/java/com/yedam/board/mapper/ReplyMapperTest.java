package com.yedam.board.mapper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.yedam.board.mapper.ReplyMapper;
import com.yedam.board.service.Criteria;
import com.yedam.board.service.ReplyVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/resources/spring/*-context.xml")
public class ReplyMapperTest {
	@Setter(onMethod_ = @Autowired)
	private ReplyMapper mapper;
	
	
	@Test
	public void testCreate2() {
		ReplyVO vo = new ReplyVO();
		
		vo.setBno(20L);
		vo.setReply("test");
		vo.setReplyer("snsnsn");
		
		mapper.insert(vo);
		
	}
	
	@Test
	public void readTest() {
		System.out.println(mapper.read(2L));
	}
	
	@Test
	public void getListTest() {
		Criteria cri = new Criteria();
		cri.setAmount(10);
		cri.setPageNum(1);
		mapper.getList(cri, 20L).forEach(item -> {
			System.out.println(item);
		});
	}
}
