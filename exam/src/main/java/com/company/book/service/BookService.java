package com.company.book.service;

import java.util.List;

public interface BookService {
	
	public int getBookNo();
	public List<BookVO>getBookList();
	public int regBook(BookVO vo);
	public List<BookVO> getRent();
}
