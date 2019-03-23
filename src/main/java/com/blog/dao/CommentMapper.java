package com.blog.dao;

import com.blog.pojo.Comment;

import java.util.List;

public interface CommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Comment comment);

    Comment selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(Comment comment);

    List<Comment> selectByForeignKey(Integer a_id);

    List<Comment> getAll();

    int getCount();
}