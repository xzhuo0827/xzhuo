package com.sboot.mybatis.entity;

import java.util.Date;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class User {
    private Integer id;

    @NonNull
    private String username;

    private String address;

    private String sex;

    private Date birthday;
    
}