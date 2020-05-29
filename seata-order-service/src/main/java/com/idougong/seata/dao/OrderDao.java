package com.idougong.seata.dao;

import com.idougong.seata.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.math.BigDecimal;

/**
 * @author zhanghang
 */
@Mapper
public interface OrderDao {

    /**
     * 创建订单
     */
    @Select("INSERT INTO `order` (`user_id`, `product_id`, `count`, `money`, `status`) VALUES (#{userId}, #{productId}, #{count}, #{money}, 0)")
    void create(Order order);

    /**
     * 修改订单金额
     */
    @Update("UPDATE `order` SET status = 1 WHERE user_id = #{userId} AND status = #{status};")
    void update(@Param("userId") Long userId, @Param("status") Integer status);

}
