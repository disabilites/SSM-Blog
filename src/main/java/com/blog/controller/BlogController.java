package com.blog.controller;

import com.blog.pojo.Article;
import com.blog.pojo.Comment;
import com.blog.service.ArticleService;
import com.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private ArticleService articleService;

    @Autowired
    private CommentService commentService;

    @RequestMapping("/blog/{articleId}")
    public ModelAndView blog(@PathVariable int articleId){
        ModelAndView mav = new ModelAndView("blog");
        Article article = articleService.select(articleId);
        List<Comment> comments = commentService.selectByForeignKey(articleId);
        mav.addObject("comments", comments);
        mav.addObject("article", article);
        return mav;
    }
}
