package com.ecom.mapper;

import com.ecom.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * ClassName: UserMapper
 * Package: com.ecom.mapper
 * Description:
 *
 * @ Author: wfz
 * @ Create: 2023-05-15 - 14:55
 * @ Version: v1.0
 */

@Mapper
public interface UserMapper {

    /**
     * 根据用户名和密码查询店员
     * @ param user
     * @ return
     */
    @Select("select * from User where username = #{username} and password = #{password}")
    User getByUsernameAndPassword(User user);
}
