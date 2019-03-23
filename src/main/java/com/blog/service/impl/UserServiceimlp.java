package com.blog.service.impl;

import com.blog.dao.UserMapper;
import com.blog.pojo.User;
import com.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("userService")
public class UserServiceimlp implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User select(String name) {
        return userMapper.selectByPrimaryKey(name);
    }

    @Override
    public int delete(String name) {
        return userMapper.deleteByPrimaryKey(name);
    }

    @Override
    public int add(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int update(User user) {
        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public User loginCheck(User user) {
        return userMapper.loginCheck(user);
    }

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public int getCount(){
        return userMapper.getCount();
    }
}
