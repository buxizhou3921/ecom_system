package com.ecom.service;

import com.ecom.entity.User;

/**
 * ClassName: UserService
 * Package: com.ecom.service
 * Description:
 *
 * @ Author: wfz
 * @ Create: 2023-05-15 - 14:55
 * @ Version: v1.0
 */


public interface UserService {
    /**
     * 店员登录
     * @ param user
     * @ return
     */
    User login(User user);
}
