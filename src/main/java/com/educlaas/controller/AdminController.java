package com.educlaas.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.educlaas.model.User;
import com.educlaas.service.UserService;

@Controller
public class AdminController {
	
	@Autowired
	private UserService userService; 
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView admin(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
		
		List<User> user = userService.viewUsers();
		System.out.println("All Users from User Profile" + user.toString());
		
		ModelAndView mav = new ModelAndView("admin");
		
		mav.addObject("UserLists", user);
		
		return mav;
	}
}
