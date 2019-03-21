package com.blog.dao;

import com.blog.pojo.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(String name);

    int insert(User record);

    User selectByPrimaryKey(String name);

    int updateByPrimaryKey(User record);

    User loginCheck(User user);

    User registerCheck(String name);

    List<User> getAll();

    int getCount();
}