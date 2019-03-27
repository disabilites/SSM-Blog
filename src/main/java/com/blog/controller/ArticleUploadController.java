package com.blog.controller;

import com.blog.pojo.Article;
import com.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class ArticleUploadController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/admin/delete-article")
    public ModelAndView deleteArticle(int id){
        ModelAndView mav = new ModelAndView("redirect:/admin/articles");
        articleService.delete(id);
        return mav;
    }

    @RequestMapping("/admin/edit-article-finish")
    public ModelAndView editFinish(int id, HttpServletRequest request){
        ModelAndView mav = new ModelAndView("redirect:/admin/articles");
        Article newArticle = articleService.select(id);
        newArticle.setContent_html(request.getParameter("content_html"));
        newArticle.setContext_md(request.getParameter("content_md"));
        articleService.update(newArticle);
        return mav;
    }

    @RequestMapping("/admin/add-article-finish")
    public ModelAndView addFinish(boolean state, HttpServletRequest request){
        ModelAndView mav = new ModelAndView("redirect:/admin/articles");
        Article article = new Article();
        Date date = new Date();
        article.setTitle(request.getParameter("article_title"));
        article.setClassification(request.getParameter("article_classification"));
        article.setDate(date);
        article.setContent_html(request.getParameter("content_html"));
        article.setContext_md(request.getParameter("content_md"));
        if (state){
            article.setState("已发布");
        }
        else {
            article.setState("草稿");
        }
        articleService.add(article);
        return mav;
    }
}