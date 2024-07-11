package com.educlaas.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.educlaas.model.User;
import com.educlaas.service.UserService;

@Controller
public class RegisterController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping (value="/register", method = RequestMethod.GET)
	public ModelAndView register(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
		ModelAndView mav = new ModelAndView("register");
		return mav;
	}
	
	
	@RequestMapping (value = "/registerProcess", method = RequestMethod.POST)
	public ModelAndView registerProcess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, @ModelAttribute("user") User user){
		userService.register(user);
		return new ModelAndView("thankyou");
	}
	
	
	
}
