package com.yedam.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.yedam.board.service.BoardVO;
import com.yedam.board.service.Criteria;

public interface BoardMapper {
	
	@Select("SELECT sysdate FROM dual")
	public String getTime();

	public String getTime2();
	
	public List<BoardVO> getList(Criteria cri);
	public long getTotalCount(Criteria cri);
	public int insert(BoardVO vo);
	public BoardVO get(int bno);
	public int update(BoardVO vo);
	public int del(long bno);
	
}
