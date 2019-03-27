package com.blog.controller;

import com.blog.pojo.User;
import com.blog.service.UserService;
import com.blog.utils.MD5Encode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/admin/delete-user")
    public ModelAndView deleteUser(String name){
        ModelAndView mav = new ModelAndView("redirect:/admin/users");
        userService.delete(name);
        return mav;
    }

    @RequestMapping("/admin/add-user-finish")
    public ModelAndView addUserFinish(User user){
        ModelAndView mav = new ModelAndView();
        if (userService.select(user.getName()) == null){
            user.setPassword(MD5Encode.MD5Encoding(user.getPassword()));
            userService.add(user);
            mav.setViewName("redirect:/admin/users");
        }else {
            mav.setViewName("redirect:/admin/add-user-fail");
        }
        return mav;
    }

    @RequestMapping("/admin/add-user-fail")
    public ModelAndView addUserFail(){
        ModelAndView mav = new ModelAndView("admin/addUserFail");
        return mav;
    }

    @RequestMapping("/admin/edit-user-finish")
    public ModelAndView editUserFinish(User user){
        ModelAndView mav = new ModelAndView("redirect:/admin/users");
        userService.update(user);
        return mav;
    }
}
