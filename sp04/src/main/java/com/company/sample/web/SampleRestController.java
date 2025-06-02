package com.company.sample.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController { // 문자 그대로 출력
	
	@GetMapping("/api")
	public String main() {
		return "hi";
	}
}
