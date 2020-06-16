package com.example.demo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.User;
import com.example.demo.form.UserForm;

@Controller
@RequestMapping("/exam04")
public class Exam04Controller {
	
	@ModelAttribute
	public UserForm setUpForm() {
		return new UserForm();
	}
	
	@RequestMapping("")
	public String index() {
		return "exam04";
	}
	
	
	@RequestMapping("result")
	public String result(@Validated UserForm userForm,
			BindingResult bindingResult, Model model) {
		
		if(bindingResult.hasErrors()) {
			return index();
		}
		User user=new User();
		BeanUtils.copyProperties(userForm, user);
		model.addAttribute("user",user);
		return "exam04-result";
	}

}
