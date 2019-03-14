package com.blog.service;

import com.blog.pojo.Article;

import java.util.List;

public interface ArticleService {

    Article select(int id);

    List<Article> getAll();

    String add(Article article);

    int update(Article article);

    String delete(int id);

    int getCount();
}
