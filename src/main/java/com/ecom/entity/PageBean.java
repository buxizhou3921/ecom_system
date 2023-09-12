package com.ecom.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * ClassName: Page
 * Package: com.ecom.entity
 * Description: 分页查询结果的封装类
 *
 * @ Author: wfz
 * @ Create: 2023-05-15 - 20:50
 * @ Version: v1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageBean {
    private Long total; // 总记录数
    private List rows; // 数据列表
}
