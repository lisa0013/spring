package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.PrdMapper;
import com.example.demo.service.PrdService;
import com.example.demo.service.PrdVO;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class PrdServiceImpl implements PrdService{

	private PrdMapper prdmapper;
	
	@Override
	public List<PrdVO> getPrdList() {
		return prdmapper.getPrdList();
	}

	@Override
	public int insertPrd(PrdVO vo) {
		return prdmapper.insertPrd(vo);
	}

}
