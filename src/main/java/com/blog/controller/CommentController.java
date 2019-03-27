package com.blog.controller;

import com.blog.pojo.Comment;
import com.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping("/make-comment")
    public ModelAndView makeComment(Comment comment, int aid, String title){
        ModelAndView mav = new ModelAndView("admin/makeComment");
        comment.setDate(new Date());
        comment.setaId(aid);
        comment.setaTitle(title);
        comment.setState(0);
        commentService.add(comment);
        return mav;
    }

    @RequestMapping("/admin/adopt")
    public ModelAndView adopt(int id){
        ModelAndView mav = new ModelAndView("redirect:/admin/comments");
        Comment comment = commentService.select(id);
        comment.setState(1);
        System.out.println(comment.getId());
        System.out.println(comment.getaId());
        System.out.println(comment.getaTitle());
        System.out.println(comment.getDate());
        System.out.println(comment.getEmail());
        System.out.println(comment.getContent());
        System.out.println(comment.getState());
        commentService.update(comment);
        return mav;
    }

    @RequestMapping("/admin/delete-comment")
    public ModelAndView deleteComment(int id){
        ModelAndView mav = new ModelAndView("redirect:/admin/comments");
        commentService.delete(id);
        return mav;
    }

    @RequestMapping("/admin/revoke")
    public ModelAndView revoke(int id){
        ModelAndView mav = new ModelAndView("redirect:/admin/comments");
        Comment comment = commentService.select(id);
        comment.setState(0);
        commentService.update(comment);
        return mav;
    }
}
