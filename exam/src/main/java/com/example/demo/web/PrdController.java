package com.example.demo.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.service.PrdService;
import com.example.demo.service.PrdVO;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class PrdController {
	
	private PrdService prdservice;
	

	@GetMapping("/") // 메인
	public String home(Model model) {
		return "main";
	}
	
	@GetMapping("/prdList") // 목록 조회
	public String getMethodName(Model model) {
		model.addAttribute("prdList", prdservice.getPrdList());
		return "prd";
	}

	@GetMapping("/register") // 등록화면으로 이동 
	public String register(Model model) {
		return "prdin";
	}
	
	@PostMapping("/register") // 등록화면으로 이동 
	public String registerpr(Model model, PrdVO vo) {
		prdservice.insertPrd(vo);
		return "redirect:/prdList";
	}
	
	
}
