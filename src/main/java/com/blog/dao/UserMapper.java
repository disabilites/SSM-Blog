package com.blog.dao;

import com.blog.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(String name);

    int insert(User record);

    User selectByPrimaryKey(String name);

    int updateByPrimaryKey(User record);
}