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
        if (articleMapper.insert(article) == 1){
            return "添加成功";
        }
        else {
            return "添加失败";
        }
    }

    @Override
    public int update(Article article) {
        return articleMapper.updateByPrimaryKey(article);
    }

    @Override
    public String delete(int id) {
        if (articleMapper.deleteByPrimaryKey(id) == 1){
            return "删除成功";
        }
        else {
            return "删除失败";
        }
    }

    @Override
    public int getCount(){
        return articleMapper.getCount();
    }
}
