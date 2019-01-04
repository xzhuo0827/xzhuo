package com.sboot.mybatis.service;

import java.util.List;

import com.sboot.mybatis.entity.User;
import com.sboot.mybatis.entity.UserExample;

public interface UserService {

	public User selectUser(int id);

	public List<User> selectBySelective(UserExample userExample, int pageNum, int pageSize);

}