package com.sboot.bean;

import java.util.Date;

import lombok.Data;

@Data
public class User {

	private Integer id;
	private String username;
	private Integer age;
	private Date createTime;

}
