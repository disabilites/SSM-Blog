package com.blog.filter;

import com.blog.pojo.User;
import com.blog.service.UserService;
import com.blog.utils.CookieManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.context.support.XmlWebApplicationContext;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "UserCookieCheckFilter")
public class UserCookieCheckFilter implements Filter {

    @Autowired
    private UserService userService;

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        String email = null;
        String password = null;
        try {
            email = CookieManage.getCookie("email", request.getCookies());
            password = CookieManage.getCookie("password", request.getCookies());
            HttpSession session = request.getSession();
            User user = userService.loginCheck(new User(email, password));
            System.out.println(user);
            System.out.println("拦截器启动");
            if (user != null){
                System.out.println("User对象存在");
                session.setAttribute("user", user);
                chain.doFilter(request, response);
            }
            else {
                System.out.println("User对象不存在");
                response.sendRedirect("/login");
                chain.doFilter(request, response);
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
            response.sendRedirect("/login");
        }
    }

    public void init(FilterConfig config) throws ServletException {
        ServletContext sc = config.getServletContext();
        XmlWebApplicationContext cxt = (XmlWebApplicationContext) WebApplicationContextUtils.getWebApplicationContext(sc);

        if(cxt != null && cxt.getBean("userService") != null && userService == null)
            userService = (UserService) cxt.getBean("userService");
    }

}
