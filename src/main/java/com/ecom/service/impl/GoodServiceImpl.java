package com.ecom.service.impl;

import com.ecom.entity.Good;
import com.ecom.entity.PageBean;
import com.ecom.mapper.GoodMapper;
import com.ecom.service.GoodService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * ClassName: GoodServiceImpl
 * Package: com.ecom.service.impl
 * Description:
 *
 * @ Author: wfz
 * @ Create: 2023-05-15 - 14:56
 * @ Version: v1.0
 */

@Slf4j
@Service
public class GoodServiceImpl implements GoodService {

    @Autowired
    private GoodMapper goodMapper;

//    @Override
//    public PageBean page(Integer pageNum, Integer pageSize) {
//        //1. 获取总记录数
//        Long count = goodMapper.count();
//
//        //2. 获取分页查询结果列表
//        Integer start = (pageNum - 1) * pageSize;
//        List<Good> goodList = goodMapper.page(start, pageSize);
//
//        //3. 封装PageBean对象
//        PageBean pageBean = new Page(count, goodList);
//        return pageBean;
//    }

    @Override
    public PageBean page(Integer pageNum, Integer pageSize,
                         String gname, String gtype, String shop) {
        //1. 设置分页参数
        PageHelper.startPage(pageNum, pageSize);

        //2. 执行查询
        List<Good> goodList = goodMapper.list(gname, gtype, shop);
        Page<Good> p = (Page<Good>) goodList;

        //3. 封装PageBean对象
        PageBean pageBean = new PageBean(p.getTotal(), p.getResult());
        return pageBean;
    }

    @Override
    public void delete(List<Integer> ids) {
        goodMapper.delete(ids);
    }

    @Override
    public void save(Good good) {
        good.setProDate(LocalDate.now());
        goodMapper.insert(good);
    }

    @Override
    public Good getById(Integer id) {
        return goodMapper.getById(id);
    }

    @Override
    public void update(Good good) {
        good.setProDate(LocalDate.now());
        goodMapper.update(good);
    }
}
