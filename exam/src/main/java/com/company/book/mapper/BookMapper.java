package com.company.book.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.company.book.service.BookVO;

@Mapper
public interface BookMapper {
	
	public List<BookVO> getBookList();
	public int getBookNo();
	public int regBook(BookVO vo);
	public List<BookVO> getRent();
}
