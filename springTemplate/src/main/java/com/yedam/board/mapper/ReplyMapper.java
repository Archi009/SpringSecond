package com.yedam.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.board.service.Criteria;
import com.yedam.board.service.ReplyVO;

public interface ReplyMapper {
	public ReplyVO read(Long rno);
	public int delete(Long rno);
	public int insert (ReplyVO vo);
	public int update(ReplyVO vo);
	public List<ReplyVO> getList(@Param("cri") Criteria cri, @Param("bno") Long bno);
	public int getCountByBno(Long bno);
}	
