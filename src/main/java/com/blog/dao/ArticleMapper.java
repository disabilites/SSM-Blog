package com.blog.dao;

import com.blog.pojo.Article;

import java.util.List;

public interface ArticleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    Article selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(Article article);

    List<Article> getAll();

    int getCount();
}