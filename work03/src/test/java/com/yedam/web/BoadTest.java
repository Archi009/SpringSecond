package com.yedam.web;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.web.mapper.BoadMapper;
import com.yedam.web.model.SearchVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/datasource-context.xml",
	                    "classpath:/spring/mybatis-context.xml"})
public class BoadTest {
	
	@Autowired BoadMapper boadMapper;
	
//	@Test
//	public void 전체조회() {
//		BoadVO vo = new BoadVO();
//		List<BoadVO> list = boadMapper.findAll(vo);
//		list.forEach(boad -> System.out.println(boad));
//	}
//	
//	@Test
//	public void 제목조회() {
//		BoadVO vo = BoadVO.builder()
//				.bno(1)
//				.writer("user00")
//				.build();
//		List<BoadVO> result = boadMapper.findAll(vo);
//		System.out.println(result);
//	}
//	@Test
//	public void 정보삽입() {
//		BoadVO vo = BoadVO.builder()
//				.title("title111")
//				.content("content111")
//				.writer("user10")
//				.build();
//		System.out.println(vo);
//		int result = boadMapper.insertNew(vo);
//		System.out.println(result);
//	}
//	@Test
//	public void 정보수정() {
//		BoadVO vo = BoadVO.builder()
//				.bno(10)
//				.title("제목")
//				.build();
//		int result = boadMapper.updateNew(vo);
//		System.out.println(result);
//	}
//	@Test 
//	public void 정보삭제() {
//		int result = boadMapper.delBno(4);
//		System.out.println(result);
//	}
	@Test
	public void 조건조회() {
		SearchVO searchVO = new SearchVO();
//		searchVO.setTitle("test");
		searchVO.setList(Arrays.asList(1,2,3));
		System.out.println(searchVO);
		boadMapper.findData(searchVO).forEach(boad -> System.out.println(boad));
	}
}
