package com.blog.controller;

import com.blog.pojo.Article;
import com.blog.pojo.Comment;
import com.blog.pojo.Image;
import com.blog.pojo.User;
import com.blog.service.ArticleService;
import com.blog.service.CommentService;
import com.blog.service.ImageService;
import com.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AdminController {
    @Autowired
    private UserService userService;

    @Autowired
    private ArticleService articleService;

    @Autowired
    private ImageService imageService;

    @Autowired
    private CommentService commentService;

    @RequestMapping("/admin")
    public ModelAndView admin(){
        ModelAndView mav = new ModelAndView("admin/index");
        int userCount = userService.getCount();
        int articleCount = articleService.getCount();
        int commentCount = commentService.getCount();
        int imageCount = imageService.getCount();
        mav.addObject("userCount", userCount);
        mav.addObject("articleCount", articleCount);
        mav.addObject("commentCount", commentCount);
        mav.addObject("imageCount", imageCount);
        return mav;
    }

    @RequestMapping("/admin/articles")
    public ModelAndView showArticles(){
        ModelAndView mav = new ModelAndView("admin/articles");
        List<Article> articles =  articleService.getAll();
        mav.addObject("articles", articles);
        return mav;
    }

    @RequestMapping("/admin/edit-article")
    public ModelAndView editArticle(int id){
        ModelAndView mav = new ModelAndView("admin/editArticle");
        Article article = articleService.select(id);
        mav.addObject("article", article);
        return mav;
    }

    @RequestMapping("/admin/add-article")
    public ModelAndView addArticle(){
        ModelAndView mav = new ModelAndView("admin/addArticle");
        return mav;
    }
    @RequestMapping("/admin/users")
    public ModelAndView showUsers(){
        ModelAndView mav = new ModelAndView("admin/users");
        List<User> users = userService.getAll();
        mav.addObject("users", users);
        return mav;
    }

    @RequestMapping("/admin/edit-user")
    public ModelAndView editUser(String name){
        ModelAndView mav = new ModelAndView("admin/editUser");
        User user = userService.select(name);
        mav.addObject("user", user);
        return mav;
    }

    @RequestMapping("/admin/add-user")
    public ModelAndView addUser(){
        ModelAndView mav = new ModelAndView("admin/addUser");
        return mav;
    }

    @RequestMapping("/admin/comments")
    public ModelAndView comments(){
        ModelAndView mav = new ModelAndView("admin/comments");
        List<Comment> comments = commentService.getAll();
        mav.addObject("comments", comments);
        return mav;
    }

    @RequestMapping("/admin/images")
    public ModelAndView images(){
        ModelAndView mav = new ModelAndView("admin/images");
        List<Image> images = imageService.getAll();
        mav.addObject("images", images);
        return mav;
    }

}