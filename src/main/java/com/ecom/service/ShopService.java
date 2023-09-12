package com.ecom.service;

import com.ecom.entity.Shop;

import java.util.List;

/**
 * ClassName: ShopService
 * Package: com.ecom.service
 * Description:
 *
 * @ Author: wfz
 * @ Create: 2023-05-15 - 14:53
 * @ Version: v1.0
 */


public interface ShopService {
    /**
     * 查询商店数据(附带商店名模糊查询)
     * @ param sname
     * @ return
     */
    List<Shop> list(String sname);

    /**
     * 根据id删除商店
     * @ param id
     */
    void delete(Integer id);

    /**
     * 新增商店
     * @ param shop
     */
    void add(Shop shop);

    /**
     * 根据id查询商店
     * @ param id
     * @ return
     */
    Shop query(Integer id);

    /**
     * 修改商店
     * @ param shop
     */
    void modify(Shop shop);
}
