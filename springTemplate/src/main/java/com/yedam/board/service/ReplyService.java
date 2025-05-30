package com.yedam.board.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ReplyService {
	public int register(ReplyVO vo);
	public ReplyVO read(Long rno);
	public int modify(ReplyVO vo);
	public int remove(Long rno);
	public List<ReplyVO> getList(@Param("cri") Criteria cri, @Param("bno") Long bno);
//	public ReplyPageDTO getListPage(Criteria cri, Long bno);
}
