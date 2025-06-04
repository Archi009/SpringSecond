package com.company.book.mapper;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.company.book.service.BookVO;

import lombok.extern.log4j.Log4j2;

@Log4j2
@ExtendWith(SpringExtension.class) 
@ContextConfiguration("file:src/main/resources/spring/*-context.xml")
public class BookMapperTest {
	
	
	@Autowired
	BookMapper mapper;
	
	@Test
	public void get() {
		mapper.getBookList().forEach(list -> log.info("List : "+list));
	}
	
	@Test
	public void reg() {
		Date date = new Date();
		BookVO vo = new BookVO();
		vo.setBook_coverimg("ss");
		vo.setBook_date(date);
		vo.setBook_info("돼라");
		vo.setBook_name("나카무라");
		vo.setBook_no(105);
		vo.setBook_price("100000");
		vo.setBook_publisher("ㅁㅁㅁㅁㅁ");
		log.info("결과  : " + mapper.regBook(vo));;
	}
	
	@Test
	public void getRent() {
		mapper.getRent().forEach(list -> log.info("List : "+list));
	}
}
