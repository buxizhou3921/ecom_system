package com.ecom.mapper;

import com.ecom.entity.Shop;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

/**
 * ClassName: ShopMapper
 * Package: com.ecom.mapper
 * Description:
 *
 * @ Author: wfz
 * @ Create: 2023-05-15 - 14:50
 * @ Version: v1.0
 */

@Mapper
public interface ShopMapper {
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
    @Delete("delete from shop where sid = #{id}")
    void deleteById(Integer id);

    /**
     * 新增商店
     * @ param shop
     */
    @Insert("insert into shop(sname, introduce) values (#{sname}, #{introduce})")
    void insert(Shop shop);

    /**
     * 根据id查询商店
     * @ param id
     * @ return
     */
    @Select("select * from shop where sid = #{id}")
    Shop queryById(Integer id);

    /**
     * 更新商店
     * @ param shop
     */
    @Update("update shop set sname = #{sname}, introduce = #{introduce} where sid = #{sid}")
    void update(Shop shop);
}
