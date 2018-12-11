package com.guweibit.kafka.producer;

import com.alibaba.fastjson.JSON;
import com.guweibit.entity.T_Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

/**
 * 消息 生产者
 */
@Component
@Slf4j
public class KafkaProducer {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    /**
     * 新增订单消息
     *
     * @param order
     */
    public void kafkaSend(T_Order order) {
        ListenableFuture send = kafkaTemplate.send("jktopic", "key", JSON.toJSONString(order));
        System.out.println(order.toString());
    }

    /**
     * 支付订单消息
     *
     * @param order
     */
    public void kafkaPaySend(T_Order order) {
        ListenableFuture send = kafkaTemplate.send("pay", "key", JSON.toJSONString(order));
        //支付成功的消息能够获取到，但是不知道怎么将数据推送给，指定的页面去。
        System.out.println(order.toString());
    }

    /**
     * 修改订单消息
     *
     * @param order
     */
    public void kafkaUpdateOrderSend(T_Order order) {
        ListenableFuture send = kafkaTemplate.send("updateorder", "key", JSON.toJSONString(order));
        System.out.println(order.toString());
    }
}
