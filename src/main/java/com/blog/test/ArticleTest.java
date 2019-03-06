package com.blog.test;

import com.blog.pojo.Article;
import com.blog.service.ArticleService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class ArticleTest {

    @Autowired
    private ArticleService articleService;

    @Test
    public void selectArticle(){
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
        System.out.println("当前时间为: " + ft.format(dNow));
        Article article;
        article = articleService.select(1);
        System.out.println(article.getId());
        System.out.println(article.getTitle());
        System.out.println(article.getContent());
        System.out.println(article.getTag());
    }

    @Test
    public void getAll(){
        List<Article> articleList;
        articleList = articleService.getAll();
        for (Article article: articleList) {
            System.out.println(article.getTitle());
        }

    }
}
