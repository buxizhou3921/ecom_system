package com.ecom.service.impl;

import com.ecom.entity.User;
import com.ecom.mapper.UserMapper;
import com.ecom.service.GoodService;
import com.ecom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserServiceImpl
 * Package: com.ecom.service.impl
 * Description:
 *
 * @ Author: wfz
 * @ Create: 2023-05-15 - 14:56
 * @ Version: v1.0
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.getByUsernameAndPassword(user);
    }
}
