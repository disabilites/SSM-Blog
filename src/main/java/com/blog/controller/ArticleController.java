package com.blog.controller;

import com.blog.pojo.Article;
import com.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @RequestMapping("/blog")
    public ModelAndView BlogController(int id){
        ModelAndView mav = new ModelAndView("blog");
        Article article;
        article = articleService.select(id);
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
            if (!articlesMap.containsKey(simpleDateFormat.format(article.getDate()))){
                articlesMap.put(simpleDateFormat.format(article.getDate()), new ArrayList<Article>());
                articlesMap.get(simpleDateFormat.format(article.getDate())).add(article);
            }
            else {
                articlesMap.get(simpleDateFormat.format(article.getDate())).add(article);
            }
        }
        mav.addObject("articlesMap", articlesMap);
        return mav;
    }
}
