package com.educlaas.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ProfileController<profile> {
	
	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public ModelAndView login (HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
		ModelAndView mav = new ModelAndView("profile");
		return mav;
	}
	
	@RequestMapping(value = "/profileProcess", method = RequestMethod.POST)
	public ModelAndView profileProcess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, @ModelAttribute("profile") profile profile){	
		return new ModelAndView("profile");

}

}