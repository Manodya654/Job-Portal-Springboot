package com.educlaas.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.educlaas.model.User;
import com.educlaas.service.UserService;


@Controller
public class UpdateController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/update/{id}")
	public ModelAndView updateUser(ModelAndView model, @PathVariable("id") int id) throws IOException {

		List<User> listuser = userService.findUserById(id);
		model.addObject("listuser", listuser);
		model.setViewName("update");

		return model;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView updateUser( @RequestParam("id") int id,
			@RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname,
		 @RequestParam("country") String country,@RequestParam("city") String city,@RequestParam("company") String company,@RequestParam("address") String address,@RequestParam("phone") String phone,@RequestParam("email") String email,@RequestParam("password") String password,@RequestParam("user_role") int user_role,
			ModelAndView mv) {

		User user = new User();
		user.setId(id);
		user.setFirstname(firstname);
		user.setLastname(lastname); 
		user.setCountry(country);
		user.setCity(city);
		user.setCompany(company);
		user.setAddress(address);
		user.setPhone(phone);
		user.setEmail(email);
		user.setPassword(password);
		user.setUser_role(user_role);
	

			int counter = userService.update(user);

			if (counter > 0) {
				mv.addObject("msg", "User records updated against User id: " + user.getId());
			} else {
				mv.addObject("msg", "Error- check the console log.");
			}

			mv.setViewName("update");

			return mv;
		}
}