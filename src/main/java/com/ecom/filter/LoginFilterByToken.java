package com.ecom.filter;

import com.alibaba.fastjson.JSONObject;
import com.ecom.entity.Result;
import com.ecom.util.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: LoginFilter
 * Package: com.ecom.filter
 * Description:
 *
 * @ Author: wfz
 * @ Create: 2023-05-16 - 17:13
 * @ Version: v1.0
 */


@Slf4j
//@WebFilter(urlPatterns = {"/main.html", "/shop_manage.html", "/good_manage.html"})
public class LoginFilterByToken implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        String url = req.getRequestURL().toString();

        // 登录操作放行
        if(url.contains("login")){
            chain.doFilter(request,response);
            return;
        }

        // 获取请求头中的令牌（token）
        String jwt = req.getHeader("token");

        // 判断令牌是否存在，如果不存在，返回错误结果（未登录）
        if(!StringUtils.hasLength(jwt)){
            Result error = Result.error("NOT_LOGIN");

            String notLogin = JSONObject.toJSONString(error);
            resp.getWriter().write(notLogin);
            return ;
        }

        // 解析token，如果解析失败，返回错误结果（未登录）
        try {
            JwtUtils.parseJWT(jwt);
        } catch (Exception e) {//jwt解析失败
            e.printStackTrace();
            Result error = Result.error("NOT_LOGIN");

            String notLogin = JSONObject.toJSONString(error);
            resp.getWriter().write(notLogin);
            return;
        }

        // 放行
        chain.doFilter(request, response);
    }
}
