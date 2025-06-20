package com.example.demo.mapper;

import java.util.List;

import com.example.demo.service.PrdVO;

public interface PrdMapper {
	
	public List<PrdVO> getPrdList();
	
	public int insertPrd(PrdVO vo);
}
