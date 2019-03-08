package com.blog.service.impl;

import com.blog.dao.UserMapper;
import com.blog.pojo.User;
import com.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userSerice")
public class UserServiceimpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User select(String name) {
        return userMapper.selectByPrimaryKey(name);
    }

    @Override
    public String delete(String name) {
        if (userMapper.deleteByPrimaryKey(name) == 1){
            return "删除成功";
        }
        else {
            return "删除失败";
        }
    }

    @Override
    public String add(User user) {
        if (userMapper.insert(user) == 1){
            return "添加成功";
        }
        else {
            return "添加失败";
        }
    }

    @Override
    public String update(User user) {
        if (userMapper.updateByPrimaryKey(user) == 1){
            return "更新成功";
        }
        else {
            return "更新失败";
        }
    }

    @Override
    public User loginCheck(User user) {
        return userMapper.loginCheck(user);
    }

    @Override
    public User registerCheck(String name){
        return userMapper.registerCheck(name);
    }
}
