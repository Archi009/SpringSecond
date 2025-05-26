package com.yedam.web.mapper;

import java.util.List;

import com.yedam.web.model.BoadVO;
import com.yedam.web.model.SearchVO;


public interface BoadMapper {
	List<BoadVO> findAll(BoadVO vo);
	
	int insertNew(BoadVO vo);
	
	int updateNew(BoadVO vo);
	int delBno (int val);
	List<BoadVO>findData(SearchVO vo);
}
