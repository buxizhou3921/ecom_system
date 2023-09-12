package com.ecom.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.ServletComponentScan;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: LoginFilter
 * Package: com.ecom.filter
 * Description:
 *
 * @ Author: wfz
 * @ Create: 2023-05-19 - 15:38
 * @ Version: v1.0
 */

@Slf4j
@ServletComponentScan
@WebFilter(urlPatterns = {"/main.html", "/shop_manage.html", "/good_manage.html"})
public class LoginFilter extends HttpFilter{
    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;

        Object login = req.getSession().getAttribute("login");

        if (login == null) {
            response.sendRedirect("/login.html");
        } else {
            chain.doFilter(request, response);
        }
    }
}
