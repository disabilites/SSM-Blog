package com.blog.service;

import com.blog.pojo.User;

import java.util.List;

public interface UserService {
    User select(String name);

    int delete(String name);

    int add(User user);

    int update(User user);

    User loginCheck(User user);

    List<User> getAll();

    int getCount();
}
