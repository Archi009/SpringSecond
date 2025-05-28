package com.yedam.board.service;

import java.util.List;

public interface BoardService {
	public List<BoardVO> getList();
	public int insert(BoardVO vo);
	public BoardVO get(int bno);
	public int update(BoardVO vo);
	public int del(long bno);
}
