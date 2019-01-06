package com.sboot.controller;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sboot.bean.User;

@RestController
public class UserController {

	@Resource(name = "userRedisTemplate")
	private RedisTemplate<String, User> userRedisTemplate;

	@RequestMapping("/hello")
	public String hello() {
		User user = new User();
		user.setId(123L);
		user.setUserName("xiaozhuo");
		user.setRealName("肖卓");
		user.setAge(18);
		userRedisTemplate.opsForValue().set("user", user);
		return "111";
	}

	@RequestMapping("/get")
	public User getUser() {
		return userRedisTemplate.opsForValue().get("user");
	}
}
