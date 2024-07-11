package com.educlaas.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.educlaas.model.Login;
import com.educlaas.model.User;
import com.educlaas.service.UserService;

@Controller
public class LoginController {
	
	@Autowired 
	private UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login (HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, @ModelAttribute("login") Login login){
		
		ModelAndView mav = null; //Clear mav object 
		
		User user = userService.validateUser(login);
		/*If user role is equal to 1 - go to User Profile Page
		 * Else user role is equal to 2 - go to Admin Page 
		 * Else show the error message */
		
		if(user != null){
			//Admin Perspective
			if(user.getUser_role() == 2)
				mav = new ModelAndView("redirect:/admin");
			else 
			//User Perspective
				mav = new ModelAndView("profile");
				mav.addObject("firstname", user.getFirstname());
				mav.addObject("lastname", user.getLastname());
				mav.addObject("email", user.getEmail());
				mav.addObject("country", user.getCountry());
		}
		else{
			//Error Message in Login Page as Username or Password is wrong
			mav = new ModelAndView("login");
			mav.addObject("errormessage", "Username or Password is incorrect!!! Please kindly retry to login");
					
		}
		
		return mav;
	}
}