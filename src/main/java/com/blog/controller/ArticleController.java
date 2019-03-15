package com.blog.controller;

import com.blog.pojo.Article;
import com.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    public ArticleService getArticleService() {
        return articleService;
    }

    public void setArticleService(ArticleService articleService) {
        this.articleService = articleService;
    }

    @RequestMapping("/blog/{articleId}")
    public ModelAndView BlogController(@PathVariable int articleId){
        ModelAndView mav = new ModelAndView("blog");
        Article article;
        article = articleService.select(articleId);
        mav.addObject("article", article);
        return mav;
    }

    @RequestMapping("/articles")
    public ModelAndView ArticlesController(){
        ModelAndView mav = new ModelAndView("articles");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        List<Article> articles;
        HashMap<String, List<Article>> articlesMap = new HashMap<>();
        articles = articleService.getAll();
        for (Article article: articles){
            String year = simpleDateFormat.format(article.getDate());
            if (!articlesMap.containsKey(year)){
                articlesMap.put(year, new ArrayList<Article>());
                articlesMap.get(year).add(article);
            }
            else {
                articlesMap.get(year).add(article);
            }
        }
        mav.addObject("articlesMap", articlesMap);
        return mav;
    }

    @RequestMapping("/tags")
    public ModelAndView TagsController(){
        ModelAndView mav = new ModelAndView("tags");
        List<Article> articles;
        HashMap<String, List<Article>> articlesMap = new HashMap<>();
        articles = articleService.getAll();
        for (Article article: articles){
            String tag = article.getTag();
            if (! articlesMap.containsKey(tag)){
                articlesMap.put(tag, new ArrayList<Article>());
                articlesMap.get(tag).add(article);
            }
            else {
                articlesMap.get(tag).add(article);
            }
        }
        mav.addObject("articlesMap", articlesMap);
        return mav;
    }
}
