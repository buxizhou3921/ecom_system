package com.ecom.controller;

import com.ecom.entity.Result;
import com.ecom.entity.User;
import com.ecom.service.UserService;
import com.ecom.util.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.javassist.compiler.ast.Variable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * ClassName: UserController
 * Package: com.ecom.controller
 * Description:
 *
 * @ Author: wfz
 * @ Create: 2023-05-15 - 14:54
 * @ Version: v1.0
 */

@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 店员登录
     * @ param user
     * @ return
     */
    @PostMapping("/login")
    public Result login(@RequestBody User user, HttpServletRequest request) {
        log.info("店员登录：{}", user);
        User u = userService.login(user);

        // 登录成功
        if (u != null) {
            // 暂不使用令牌技术
//            HashMap<String, Object> claims = new HashMap<>();
//            claims.put("uid", u.getUid());
//            claims.put("username", u.getUsername());
//
//            String jwt = JwtUtils.generateJwt(claims);
//            return Result.success(jwt);

            request.getSession().setAttribute("login", "yes");
            return Result.success();
        }

        // 登录失败，返回错误信息
        return Result.error("用户名或密码错误");
    }
}
