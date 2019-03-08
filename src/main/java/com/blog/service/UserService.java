package com.blog.service;

import com.blog.pojo.User;

public interface UserService {
    User select(String name);

    String delete(String name);

    String add(User user);

    String update(User user);

    User loginCheck(User user);

    User registerCheck(String name);
}
