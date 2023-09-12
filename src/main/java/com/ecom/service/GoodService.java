package com.ecom.service;

import com.ecom.entity.Good;
import com.ecom.entity.PageBean;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

/**
 * ClassName: GoodService
 * Package: com.ecom.service
 * Description:
 *
 * @ Author: wfz
 * @ Create: 2023-05-15 - 14:54
 * @ Version: v1.0
 */


public interface GoodService {
    /**
     * 商品综合查询（分页，条件，组合查询）
     * @ param pageNum
     * @ param pageSize
     * @ param gname
     * @ param gtype
     * @ param shop
     * @ param begin
     * @ param end
     * @ return
     */
    PageBean page(Integer pageNum, Integer pageSize,
                  String gname, String gtype, String shop);

    /**
     * 批量删除商品
     * @ param ids
     */
    void delete(List<Integer> ids);

    /**
     * 新增商品
     * @ param good
     */
    void save(Good good);

    /**
     * 根据id查询商品
     * @ param id
     * @ return
     */
    Good getById(Integer id);

    /**
     * 更新商品信息
     * @ param good
     */
    void update(Good good);
}
