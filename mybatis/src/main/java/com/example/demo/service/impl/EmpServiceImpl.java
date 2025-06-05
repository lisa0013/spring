package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.EmpMapper;
import com.example.demo.service.EmpService;
import com.example.demo.service.EmpVO;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmpServiceImpl implements EmpService{
	
	private EmpMapper empmapper;

	@Override
	public List<EmpVO> getEmpList() {	
		return empmapper.getEmpList();
	}

}
