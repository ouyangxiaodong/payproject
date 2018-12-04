package com.guweibit.mapper;

import com.guweibit.entity.T_Order;

public interface T_OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(T_Order record);

    int insertSelective(T_Order record);

    T_Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(T_Order record);

    int updateByPrimaryKey(T_Order record);
}