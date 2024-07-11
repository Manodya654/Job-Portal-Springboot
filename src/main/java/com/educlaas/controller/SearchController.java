package com.educlaas.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.educlaas.service.UserService;

@Controller
public class SearchController {
	
	@Autowired
	private UserService userService;

	
	@RequestMapping(value = "/search")
	public ModelAndView Search(@RequestParam(value = "listuser", required = false) 
	
		
		 int plistuser, HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView("search");

       mav.addObject("listuser", plistuser);
       mav.addObject("searchResult", userService.findUserById(plistuser));      

     return mav;
	}
	
}
