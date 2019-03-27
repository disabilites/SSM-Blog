package com.blog.controller;

import com.blog.pojo.Article;
import com.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class ClassificationController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/classifications")
    public ModelAndView classifications(){
        ModelAndView mav = new ModelAndView("classifications");
        List<Article> articles;
        HashMap<String, List<Article>> articlesMap = new HashMap<>();
        articles = articleService.getAll();
        for (Article article: articles){
            String classification = article.getClassification();
            if (! articlesMap.containsKey(classification)){
                articlesMap.put(classification, new ArrayList<Article>());
                articlesMap.get(classification).add(article);
            }
            else {
                articlesMap.get(classification).add(article);
            }
        }
        mav.addObject("articlesMap", articlesMap);
        return mav;
    }
}
