package com.example.demo.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
	
	@Autowired
	private ServletContext application;
	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	
	@RequestMapping("result")
	public String result(int pro1,int pro2,int pro3) {
		
		int totalPrice;
		int taxIncludePrice;
		
		totalPrice=pro1+pro2+pro3;
		taxIncludePrice=(int)(totalPrice*1.1);
		application.setAttribute("totalPrice", totalPrice);
		application.setAttribute("taxIncludePrice", taxIncludePrice);
		
		return "exam03-result";
	}

}
