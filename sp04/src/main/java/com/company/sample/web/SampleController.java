package com.company.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.company.sample.mapper.TimeMapper;
import com.company.sample.service.SampleService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class SampleController { // 페이지 이동
	
	private SampleService sampleService;
	private TimeMapper timeMapper;
	
	@GetMapping("/")
	public String main() {
		sampleService.sample("");
		timeMapper.getTime2();
		return  "home";
	}
	
	@GetMapping({"/all", "/member", "/admin", "/accessError", "/login"})
	public void all(HttpServletRequest request) {
		System.out.println(request.getRequestURI());
	}
}
