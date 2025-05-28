package com.yedam.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.domain.EmployeesDepartmentListVO;
import com.yedam.domain.EmployeesDepartmentVO;
import com.yedam.domain.SampleDTO;


@Controller
public class SampleController {

	@GetMapping("/ex01")
	public String ex01(SampleDTO sample,
						Model model) {
		System.out.println(sample);
		model.addAttribute("dept","개발");
		return "main";
	}
	
	@GetMapping("/ex02")
	public String ex02(@RequestParam(name ="name") String name,
					   @RequestParam(name ="age",
					   				required = false,
							   		defaultValue = "20") int age) {
		System.out.println(name);
		System.out.println(age);
		return "main";
	}
	
	@GetMapping("/ex02List") // 쿼리스트링으로(?)
	public String ex02List(@RequestParam("hobby") List<String> param) {
		System.out.println(param);
		return "main";
	}
	
	@GetMapping("/ex03/{class}/{stdno}") // 주소로 받아옴
	public String ex03(@PathVariable("class") String classNo,
						@PathVariable("stdno")int stdno) {
		System.out.println("class:"+ classNo);
		System.out.println("stdno:"+ stdno);
		return "main";
	}
	
	@PostMapping("/ex04")
	public String ex04(@RequestBody EmployeesDepartmentVO emp) {
		System.out.println(emp);
		return "main";
	}
	
	@PostMapping("/ex05")
	public String ex05(@RequestBody EmployeesDepartmentListVO emp) { // @RequestBody 제이슨 스트링
		System.out.println(emp);
		return "main";
	}
	
	@PostMapping("/ex06") //@RequestBody는 @GetMapping 안됨
	@ResponseBody // ajax 호출이 경우 무조건 들어가야함
	public SampleDTO ex06(@RequestBody SampleDTO sample) { // 일반 쿼리스트링
		return sample;
	}
	
	@GetMapping("ex07")
	@ResponseBody// 이게 있으면 리턴에 있는 값을 결과만 넘겨줌 "main" 이거 그대로
	public String ex07() {
		return "main"; 
	}
	
	@GetMapping("ex08")
	public String ex08(Model model, RedirectAttributes rttr) {
		rttr.addFlashAttribute("msg","휘발성파라미터");
		rttr.addAttribute("name","홍길동"); //?name=aa
		return "redirect:ex01";
	}
}
