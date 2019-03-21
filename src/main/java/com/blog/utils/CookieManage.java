package com.blog.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

public class CookieManage {

    public static void addCookie(String cookieName, String cookieValue, HttpServletResponse response, boolean flag) {
        Cookie newCookie = new Cookie(cookieName, cookieValue);
        newCookie.setPath("/");
        if (flag){
            newCookie.setMaxAge(60 * 60 * 24);
        }
        response.addCookie(newCookie);
    }

    public static void killCookie(String cookieName, HttpServletResponse response) {
        Cookie deadCookie = new Cookie(cookieName, null);
        deadCookie.setPath("/");
        deadCookie.setMaxAge(0);
        response.addCookie(deadCookie);
    }

    public static String getCookie(String cookieName, Cookie[] cookies) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(cookieName)) {
                return cookie.getValue();
            }
        }
        return null;
    }
}
