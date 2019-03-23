package com.blog.service;

import com.blog.pojo.Comment;

import java.util.List;

public interface CommentService {

    int add(Comment comment);

    int delete(int id);

    Comment select(int id);

    int update(Comment comment);

    List<Comment> selectByForeignKey(int a_id);

    List<Comment> getAll();

    int getCount();
}
