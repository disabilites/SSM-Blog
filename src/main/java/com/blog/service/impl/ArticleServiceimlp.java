package com.blog.service.impl;

import com.blog.dao.ArticleMapper;
import com.blog.pojo.Article;
import com.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("articleService")
public class ArticleServiceimlp implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public Article select(int id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Article> getAll() {
        return articleMapper.getAll();
    }

    @Override
    public int add(Article article) {
        return articleMapper.insert(article);
    }

    @Override
    public int update(Article article) {
        return articleMapper.updateByPrimaryKey(article);
    }

    @Override
    public int delete(int id) {
        return articleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int getCount(){
        return articleMapper.getCount();
    }

}
