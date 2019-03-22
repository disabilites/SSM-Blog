package com.blog.controller;

import com.blog.pojo.Article;
import com.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping({"/", "/index"})
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView("index");
        List<Article> articles;
        articles = articleService.getAll();
        mav.addObject("articles", articles);
        return mav;
    }
}
