package com.idougong.seata.controller;

import com.idougong.seata.entity.CommonResult;
import com.idougong.seata.entity.Order;
import com.idougong.seata.service.AccountService;
import com.idougong.seata.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author zhanghang
 */
@RestController
@RequestMapping(value = "/order")
public class OrderController  {

    @Autowired
    private OrderService orderService;

    /**
     * 创建订单
     */
    @GetMapping("/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult("订单创建成功!", 200);
    }

}
