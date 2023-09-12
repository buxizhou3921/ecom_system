package com.ecom.service.impl;

import com.ecom.entity.Shop;
import com.ecom.mapper.ShopMapper;
import com.ecom.service.GoodService;
import com.ecom.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: ShopServiceImpl
 * Package: com.ecom.service.impl
 * Description:
 *
 * @ Author: wfz
 * @ Create: 2023-05-15 - 14:55
 * @ Version: v1.0
 */

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopMapper shopMapper;

    @Override
    public List<Shop> list(String sname) {
        return shopMapper.list(sname);
    }

    @Override
    public void delete(Integer id) {
        shopMapper.deleteById(id);
    }

    @Override
    public void add(Shop shop) {
        shopMapper.insert(shop);
    }

    @Override
    public Shop query(Integer id) {
        return shopMapper.queryById(id);
    }

    @Override
    public void modify(Shop shop) {
        shopMapper.update(shop);
    }
}
