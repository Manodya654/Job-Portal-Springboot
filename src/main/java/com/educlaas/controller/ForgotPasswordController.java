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
public class ForgotPasswordController{
	
	@Autowired
	private UserService userService;
	

	@RequestMapping(value = "/forgotpassword", method = RequestMethod.GET)
	public ModelAndView forgotpassword(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
		ModelAndView mav = new ModelAndView("forgotpassword");
		
		
		return mav;
	}
	@RequestMapping(value = "/forgotpasswordProcess", method = RequestMethod.POST)
    public ModelAndView forgotpasswordProcess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, @ModelAttribute("forgotpassword") User user){
	
		userService.forgotpassword(user);
		
		return new ModelAndView("resetPassword");
	}
       

}
