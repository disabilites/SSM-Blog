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


    public ArticleMapper getArticleMapper() {
        return articleMapper;
    }

    public void setArticleMapper(ArticleMapper articleMapper) {
        this.articleMapper = articleMapper;
    }

    @Override
    public Article select(int id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Article> getAll() {
        return articleMapper.getAll();
    }

    @Override
    public String add(Article article) {
        return null;
    }

    @Override
    public String update(Article article) {
        return null;
    }

    @Override
    public String delete(int id) {
        return null;
    }

    @Override
    public int getCount(){
        return articleMapper.getCount();
    }
}
