package com.guweibit.controller;

import com.alibaba.fastjson.JSONObject;
import com.guweibit.config.socket.ChatSocket;
import com.guweibit.entity.T_Order;
import com.guweibit.kafka.producer.KafkaProducer;
import com.guweibit.service.T_OrderService;
import com.guweibit.utils.DateUtils;
import com.guweibit.vo.T_OrderVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {
    @Autowired
    private T_OrderService orderService;
    @Autowired
    private KafkaProducer kafkaProducer;
    @Autowired
    private ChatSocket chatSocket;

    @PostMapping("/articles")
    Object articles(@RequestBody T_Order order){
        if (ObjectUtils.isEmpty(order)){
            return new HashMap<String,String>().put("message","传递参数为空");
        }
        kafkaProducer.kafkaSend(order);
        //return orderService.insertSelective(order);
        return null;
    }
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public List<T_OrderVO> orderAll(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return orderService.orderAll(pageNum, pageSize,null);
    }

    @RequestMapping(value = "/payAll/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public List<T_OrderVO> orderPayAll(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return orderService.orderAll(pageNum, pageSize,"1");
    }

}
