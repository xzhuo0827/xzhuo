package com.sboot.freemarker.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping(value = "/login")
	public ModelAndView index(ModelAndView modelAndView) {
		modelAndView.setViewName("login");

		List<String> userList = new ArrayList<String>();
		userList.add("admin");
		userList.add("user1");
		userList.add("user2");

		modelAndView.addObject("userList", userList);
		return modelAndView;
	}

	@RequestMapping(value = "/index")
	public ModelAndView login(ModelAndView modelAndView) {
		modelAndView.setViewName("index");

		List<String> userList = new ArrayList<String>();
		userList.add("admin");
		userList.add("user1");
		userList.add("user2");

		modelAndView.addObject("userList", userList);
		return modelAndView;
	}
	
}