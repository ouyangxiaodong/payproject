package com.guweibit.kafka.consumer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.guweibit.config.socket.ChatSocket;
import com.guweibit.entity.T_Order;
import com.guweibit.service.T_OrderService;
import com.guweibit.utils.DateUtils;
import com.guweibit.vo.T_OrderVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Date;

/**
 * 消息消费者
 */
@Slf4j
@Component
public class KafkaConsumer {

    @Autowired
    private T_OrderService orderService;

    @Autowired
    private ChatSocket chatSocket;

    /**
     * 监听topic 为 jktopic 的消息主题
     *
     * @param consumerRecord
     * @throws InterruptedException
     */
    @KafkaListener(topics = {"jktopic"})
    public void jktopic(ConsumerRecord consumerRecord) throws InterruptedException {
        System.out.println(consumerRecord.offset());
        System.out.println(consumerRecord.value().toString());
        String strOrder = (String) consumerRecord.value().toString();
        T_Order order = JSON.parseObject(strOrder, T_Order.class);
        orderService.insertSelective(order);
        System.out.println(consumerRecord.offset());
        System.out.println(consumerRecord.value().toString());
        log.info("新增订单" + JSON.toJSONString(order));
    }

    /**
     * 支付订单
     *
     * @param consumerRecord
     * @throws InterruptedException
     */
    @KafkaListener(topics = {"pay"})
    public void pay(ConsumerRecord consumerRecord) throws InterruptedException {
        System.out.println(consumerRecord.offset());
        System.out.println(consumerRecord.value().toString());
        String strOrder = (String) consumerRecord.value().toString();
        T_Order paramsOrder = JSON.parseObject(strOrder, T_Order.class);
        T_Order order = orderService.selectByPrimaryKey(paramsOrder.getId());

        if (null != order.getPaytime()) {
            order.setPaytime(new Date());
        }
        if ("0".equals(order.getPayStatus())) {
            order.setPayStatus("1");
            orderService.updateByPrimaryKey(order);
        }
        T_OrderVO t_orderVO = new T_OrderVO();
        t_orderVO.setPayTimeVo(DateUtils.dateFormatToString(order.getPaytime()));
        t_orderVO.setShopId(order.getShopId());
        t_orderVO.setPayType(order.getPayType());
        t_orderVO.setSumprice(order.getSumprice());
        t_orderVO.setId(order.getId());
        try {
            chatSocket.sendMessage(JSONObject.toJSONString(t_orderVO));
            log.info("消费支付消息");
        } catch (Exception e) {
            log.error("执行出现错误", e.getMessage());
        }
        System.out.println(consumerRecord.offset());
        System.out.println(consumerRecord.value().toString());

        log.info("修改订单支付状态" + JSONObject.toJSONString(order));
    }

    /**
     * 修改订单
     *
     * @param consumerRecord
     * @throws InterruptedException
     */
    @KafkaListener(topics = {"updateorder"})
    public void updateorder(ConsumerRecord consumerRecord) throws InterruptedException {
        String strOrder = (String) consumerRecord.value().toString();
        if (!StringUtils.isEmpty(strOrder)) {
            T_Order paramsOrder = JSON.parseObject(strOrder, T_Order.class);
            // 订单编号
            String out_trade_no = paramsOrder.getId();
            // 可能需要修改的数据
            String number = paramsOrder.getNumber();
            String payType = paramsOrder.getPayType();

            T_Order order = orderService.selectByPrimaryKey(out_trade_no);
            // 修改了 商品的数量需要进行修改数据库中的数据
            if (!number.equals(order.getNumber())) {
                order.setNumber(number);
                order.setSumprice(paramsOrder.getSumprice());
            }
            // 修改了支付方式需要
            if (!payType.equals(order.getPayType())) {
                order.setPayType(payType);
            }
            System.out.println(consumerRecord.offset());
            System.out.println(consumerRecord.value().toString());
            orderService.updateByPrimaryKeySelective(order);
            log.info("修改订单数据" + JSONObject.toJSONString(order));
        } else {
            log.error("修改订单数据为空");
        }
    }
}
