package com.ecom.controller;

import com.ecom.entity.Result;
import com.ecom.entity.Shop;
import com.ecom.service.ShopService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName: ShopController
 * Package: com.ecom.controller
 * Description:
 *
 * @ Author: wfz
 * @ Create: 2023-05-15 - 14:48
 * @ Version: v1.0
 */
@Slf4j
@RestController
@RequestMapping("/shops")
public class ShopController {

    @Autowired
    private ShopService shopService;

    /**
     * 查询商店数据(附带商店名模糊查询)
     * @ param sname
     * @ return
     */
    @GetMapping
    public Result list(String sname){
        log.info("查询商店数据,参数: {}", sname);

        List<Shop> shopList = shopService.list(sname);
        return Result.success(shopList);
    }

    /**
     * 根据id删除商店
     * @ param id
     * @ return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        log.info("根据id删除商店:{}", id);

        shopService.delete(id);
        return Result.success();
    }

    /**
     * 新增商店
     * @ return
     */
    @PostMapping
    public Result add(@RequestBody Shop shop) {
        log.info("新增商店:{}", shop);

        shopService.add(shop);
        return Result.success();
    }

    /**
     * 根据id查询商店
     * @ param id
     * @ return
     */
    @GetMapping ("/{id}")
    public Result query(@PathVariable Integer id) {
        log.info("根据id查询商店:{}", id);

        Shop shop = shopService.query(id);
        return Result.success(shop);
    }

    /**
     * 修改商店
     * @ param shop
     * @ return
     */
    @PutMapping
    public Result modify(@RequestBody Shop shop) {
        log.info("修改商店:{}", shop);

        shopService.modify(shop);
        return Result.success();
    }
}
