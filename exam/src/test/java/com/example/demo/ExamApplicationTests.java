package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;

import com.example.demo.mapper.PrdMapper;
import com.example.demo.service.PrdVO;

@SpringBootTest
class ExamApplicationTests {

	@Autowired PrdMapper prdmapper;
	
	@Test
	void contextLoads() {
	}

	@Test
	public List<PrdVO> getMethodName() {
		return prdmapper.getPrdList();
	}
}
