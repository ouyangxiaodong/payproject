package com.guweibit.controller;

import com.guweibit.entity.T_Order;
import com.guweibit.service.T_OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private T_OrderService orderService;
    @PostMapping("/articles")
    Object articles(@RequestBody T_Order order){
        if (ObjectUtils.isEmpty(order)){
            return new HashMap<String,String>().put("message","传递参数为空");
        }
        return orderService.insert(order);
    }
}
