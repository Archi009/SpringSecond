package com.company.book.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.book.mapper.BookMapper;
import com.company.book.service.BookService;
import com.company.book.service.BookVO;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookMapper mapper;
	
	@Override
	public List<BookVO> getBookList() {
	
		return mapper.getBookList();
	}

	@Override
	public int getBookNo() {
		
		return mapper.getBookNo();
	}

	@Override
	public int regBook(BookVO vo) {
		
		return mapper.regBook(vo);
	}

	@Override
	public List<BookVO> getRent() {
		// TODO Auto-generated method stub
		return mapper.getRent();
	}

}
