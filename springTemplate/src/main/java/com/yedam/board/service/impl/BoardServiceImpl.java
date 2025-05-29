package com.yedam.board.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yedam.board.mapper.BoardMapper;
import com.yedam.board.service.BoardService;
import com.yedam.board.service.BoardVO;
import com.yedam.board.service.Criteria;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	final BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> getList(Criteria cri) {
		// TODO Auto-generated method stub
		return boardMapper.getList(cri);
	}

	@Override
	public int insert(BoardVO vo) {
		
		return boardMapper.insert(vo);
	}

	@Override
	public BoardVO get(int bno) {
		// TODO Auto-generated method stub
		return boardMapper.get(bno);
	}

	@Override
	public int update(BoardVO vo) {
		// TODO Auto-generated method stub
		return boardMapper.update(vo);
	}

	@Override
	public int del(long bno) {
		// TODO Auto-generated method stub
		return boardMapper.del(bno);
	}

	@Override
	public long getTotalCount(Criteria cri) {
		// TODO Auto-generated method stub
		return boardMapper.getTotalCount(cri);
	}




	
}
