package com.blog.service.impl;

import com.blog.dao.CommentMapper;
import com.blog.pojo.Comment;
import com.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("commentService")
public class CommentServiceimlp implements CommentService {
    @Autowired
    private CommentMapper commentMapper;

    @Override
    public int add(Comment comment) {
        return commentMapper.insert(comment);
    }

    @Override
    public int delete(int id) {
        return commentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Comment select(int id) {
        return commentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Comment comment) {
        return commentMapper.updateByPrimaryKey(comment);
    }

    @Override
    public List<Comment> getAll() {
        return commentMapper.getAll();
    }

    @Override
    public int getCount() {
        return commentMapper.getCount();
    }

    @Override
    public List<Comment> selectByForeignKey(int a_id) {
        return commentMapper.selectByForeignKey(a_id);
    }
}
