package com.ecom.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: User
 * Package: com.ecom.entity
 * Description: 系统用户
 *
 * @ Author: wfz
 * @ Create: 2023-05-15 - 14:54
 * @ Version: v1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer uid;
    private String username;
    private String password;
}
