package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex03")
public class Exam03Controller {

	@Autowired
	private ServletContext application;

	@RequestMapping("")
	public String index() {
		return "exam03";
	}

	@RequestMapping("calc-item")
	public String calc(int num1, int num2, int num3) {
		int answer = num1 + num2 + num3;
		int taxanswer = (int) (answer * 1.08);
		application.setAttribute("answer", answer);
		application.setAttribute("taxanswer", taxanswer);
		return "exam03-result";
	}

}
