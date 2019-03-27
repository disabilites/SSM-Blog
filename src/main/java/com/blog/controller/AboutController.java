package com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AboutController {

    @RequestMapping("/about")
    public ModelAndView about(){
        ModelAndView mav = new ModelAndView("about");
        return mav;
    }
}
