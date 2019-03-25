package com.blog.controller;

import com.blog.pojo.User;
import com.blog.service.UserService;
import com.blog.utils.CookieManage;
import com.blog.utils.MD5Encode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public ModelAndView login(){
        ModelAndView mav = new ModelAndView("/login");
        mav.addObject("flag", true);
        return mav;
    }

    @RequestMapping("/signIn")
    public ModelAndView signIn(User user, HttpSession session, HttpServletRequest request, HttpServletResponse response){
        ModelAndView mav;

        if (user.getPassword().length() < 32){
            user.setPassword(MD5Encode.MD5Encoding(user.getPassword()));
        }

        User Loginuser = userService.loginCheck(user);
        System.out.println(Loginuser);

        if (Loginuser != null){
            try {
                String remember = request.getParameter("remember");
                if (remember.equals("on")){
                    CookieManage.addCookie("email", Loginuser.getEmail(), response, true);
                    CookieManage.addCookie("password", Loginuser.getPassword(), response, true);
                }
            }catch (Exception e){
                System.out.println("Can't Remember Password");
                CookieManage.addCookie("email", Loginuser.getEmail(), response, false);
                CookieManage.addCookie("password", Loginuser.getPassword(), response, false);
            }
            mav = new ModelAndView("redirect:/admin");
            session.setAttribute("user", Loginuser);
            return mav;
        }
        else {
            mav = new ModelAndView("login");
            mav.addObject("flag", false);
            return mav;
        }
    }

    @RequestMapping("/signOut")
    public ModelAndView signOut(HttpSession session, HttpServletResponse response){
        ModelAndView mav = new ModelAndView("redirect:/login");
        CookieManage.killCookie("email", response);
        CookieManage.killCookie("password", response);
        session.removeAttribute("user");
        session.removeAttribute("state");
        return mav;
    }
}
