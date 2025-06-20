package com.example.demo.service;

import java.util.List;

public interface PrdService {

	public List<PrdVO> getPrdList();
	
	public int insertPrd(PrdVO vo);
}
