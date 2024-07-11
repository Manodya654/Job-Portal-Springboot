package com.educlaas.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.educlaas.service.UserService;

@Controller
public class DeleteController {
	
	@Autowired
	private UserService UserService;

	@RequestMapping(value = "/delete/{id}")
	public ModelAndView deleteStudentById(ModelAndView mv, @PathVariable("id") int id)
			throws IOException {

		int counter = UserService.delete(id);

		if (counter > 0) {
			mv.addObject("msg", "User records deleted against id: " + id);
		} else {
			mv.addObject("msg", "Error- check the console log.");
		}

		mv.setViewName("delete");

		return mv;
 }

}
