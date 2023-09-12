package com.ecom.mapper;

import com.ecom.entity.Good;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

/**
 * ClassName: GoodMapper
 * Package: com.ecom.mapper
 * Description:
 *
 * @ Author: wfz
 * @ Create: 2023-05-15 - 14:50
 * @ Version: v1.0
 */

@Mapper
public interface GoodMapper {

//    /**
//     * 查询总记录数
//     * @ return
//     */
//    @Select("select count(*) from good")
//    Long count();
//
//    /**
//     * 分页查询, 获取列表数据
//     * @ param start
//     * @ param pageSize
//     * @ return
//     */
//    @Select("select * from good limit #{start}, #{pageSize}")
//    List<Good> page(@Param("start") Integer start, @Param("pageSize") Integer pageSize);

    /**
     * 商品综合查询（分页，条件，组合查询）
     * @ param gname
     * @ param gtype
     * @ param shop
     * @ param begin
     * @ param end
     * @ return
     */
    List<Good> list(@Param("gname") String gname, @Param("gtype") String gtype, @Param("shop") String shop);

    /**
     * 批量删除商品
     * @ param ids
     */
    void delete(@Param("ids") List<Integer> ids);

    /**
     * 新增商品
     * @ param good
     */
    @Insert("insert into good(gname, gimg, description, pro_date, price, gtype, shop) " +
            "values(#{gname}, #{gimg}, #{description}, #{proDate}, #{price}, #{gtype}, #{shop})")
    void insert(Good good);

    /**
     * 根据id查询商品
     * @ param id
     * @ return
     */
    @Select("select * from good where gid = #{id}")
    Good getById(Integer id);

    /**
     * 更新商品信息
     * @ param good
     */
    void update(Good good);
}
