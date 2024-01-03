package com.ecom.controller;

import com.ecom.anno.Log;
import com.ecom.entity.Good;
import com.ecom.entity.PageBean;
import com.ecom.entity.Result;
import com.ecom.service.GoodService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

/**
 * ClassName: GoodController
 * Package: com.ecom.controller
 * Description:
 *
 * @ Author: wfz
 * @ Create: 2023-05-15 - 14:49
 * @ Version: v1.0
 */

@Slf4j
@RestController
@RequestMapping("/goods")
public class GoodController {

    @Autowired
    private GoodService goodService;

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
    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer pageNum,
                       @RequestParam(defaultValue = "10") Integer pageSize,
                       String gname, String gtype, String shop){
        log.info("分页查询, 参数: {},{},{},{},{},{},{}", pageNum, pageSize, gname, gtype, shop);

        PageBean pageBean = goodService.page(pageNum,pageSize, gname, gtype, shop);
        return Result.success(pageBean);
    }

    /**
     * 批量删除商品
     * @ param ids
     * @ return
     */
    @Log
    @DeleteMapping("/{ids}")
    public Result delete(@PathVariable List<Integer> ids) {
        log.info("批量删除商品, ids: {}", ids);
        goodService.delete(ids);
        return Result.success();
    }


    /**
     * 新增商品
     * @ param good
     * @ return
     */
    @Log
    @PostMapping
    public Result save(@RequestBody Good good) {
        log.info("新增商品, good:{}", good);
        goodService.save(good);
        return Result.success();
    }

    /**
     * 根据id查询商品
     * @ param id
     * @ return
     */
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        log.info("根据id查询商品，id:{}", id);
        Good good = goodService.getById(id);
        return Result.success(good);
    }

    /**
     * 更新商品信息
     * @ param good
     * @ return
     */
    @Log
    @PutMapping
    public Result update(@RequestBody Good good) {
        log.info("更新商品信息: {}", good);
        goodService.update(good);
        return Result.success();
    }
}