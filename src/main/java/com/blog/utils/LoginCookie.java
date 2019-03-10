package com.blog.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCookie {

    public void addCookie(String cookieName, String cookieValue, HttpServletResponse response) {
        Cookie newCookie = new Cookie(cookieName, cookieValue);
        newCookie.setPath("/");
        newCookie.setMaxAge(60 * 60 * 24);
        response.addCookie(newCookie);
    }

    public void killCookie(String cookieName, HttpServletResponse response) {
        Cookie deadCookie = new Cookie(cookieName, null);
        deadCookie.setPath("/");
        deadCookie.setMaxAge(0);
        response.addCookie(deadCookie);
    }

    public String getCookie(String cookieName, Cookie[] cookies, HttpServletResponse response) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(cookieName)) {
                return cookie.getValue();
            }
        }
        return null;
    }
}
