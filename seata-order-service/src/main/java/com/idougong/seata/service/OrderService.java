package com.idougong.seata.service;

import com.idougong.seata.entity.Order;

public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);

}
