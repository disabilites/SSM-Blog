package com.blog.service;

import com.blog.pojo.Article;

import java.util.List;

public interface ArticleService {

    Article select(int id);

    List<Article> getAll();

    int add(Article article);

    int update(Article article);

    int delete(int id);

    int getCount();
}
