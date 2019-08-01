package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex03")
public class Exam03Controller {

	@RequestMapping("")
	public String index() {
		return "exam02";
	}
	
	@RequestMapping("calc-item")
	public String calc(int num1, int num2 ,Model model) {
		int answer = num1 * num2;
		
		model.addAttribute("num1",num1);
		model.addAttribute("num2",num2);
		model.addAttribute("answer",answer);
		return "exam02-result";
	}
	
}
