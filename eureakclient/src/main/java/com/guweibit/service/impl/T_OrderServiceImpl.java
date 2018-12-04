package com.guweibit.service.impl;

import com.guweibit.entity.T_Order;
import com.guweibit.mapper.T_OrderMapper;
import com.guweibit.service.T_OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class T_OrderServiceImpl implements T_OrderService  {

    @Autowired
    private T_OrderMapper orderMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return orderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(T_Order record) {
        return orderMapper.insert(record);
    }

    @Override
    public int insertSelective(T_Order record) {
        return orderMapper.insertSelective(record);
    }

    @Override
    public T_Order selectByPrimaryKey(String id) {
        return orderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(T_Order record) {
        return orderMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(T_Order record) {
        return orderMapper.updateByPrimaryKey(record);
    }
}
