package com.guweibit.service;

import com.guweibit.entity.T_Order;

public interface T_OrderService {
    int deleteByPrimaryKey(String id);

    int insert(T_Order record);

    int insertSelective(T_Order record);

    T_Order selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(T_Order record);

    int updateByPrimaryKey(T_Order record);
}
