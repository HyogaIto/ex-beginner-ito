package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {
	@RequestMapping("")
	public String index() {
		return "exam02";
	}
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping("/result")
	public String result(int num1,int num2) {
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num1);
		session.setAttribute("result", num1+num2);
	
		return "exam02-result";
		
	}
	
	@RequestMapping("/result2")
	public String result2() {
		return "exam02-result2";
		
	}

}
