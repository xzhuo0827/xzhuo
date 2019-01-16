package com.sboot.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.sboot.mybatis.dao.UserMapper;
import com.sboot.mybatis.entity.User;
import com.sboot.mybatis.entity.UserExample;
import com.sboot.mybatis.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	public User selectUser(int id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<User> selectBySelective(UserExample userExample, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		return userMapper.selectByExample(userExample);
	}

}