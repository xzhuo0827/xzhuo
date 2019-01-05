package com.sboot.mybatis.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sboot.mybatis.entity.User;
import com.sboot.mybatis.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/user/{id}")
	public ModelAndView selectUser(@PathVariable("id") int id, ModelAndView modelAndView) {
		modelAndView.setViewName("index");
		List<User> userList = new ArrayList<User>();
		userList.add(userService.selectUser(id));
		modelAndView.addObject("userList", userList);
		return modelAndView;
	}

	@RequestMapping("/userList")
	public ModelAndView selectBySelective(ModelAndView modelAndView) {
		modelAndView.setViewName("index");
		List<User> userList = userService.selectBySelective(null, 1, 10);
		modelAndView.addObject("userList", userList);
		return modelAndView;
	}

}
