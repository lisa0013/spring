package com.example.demo.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.EmpService;
import com.example.demo.service.EmpVO;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class EmpController {
	
	private EmpService empservice;
	
	
	@GetMapping("/EmpList")
	public String getMethodName(Model model) {
		model.addAttribute("empList", empservice.getEmpList());
		return "emp";
	} 
}
