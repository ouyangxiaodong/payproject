package com.guweibit.mapper;

import com.guweibit.entity.T_Order;
import org.springframework.stereotype.Component;

@Component
public interface T_OrderMapper {
    int deleteByPrimaryKey(String id);

    int insert(T_Order record);

    int insertSelective(T_Order record);

    T_Order selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(T_Order record);

    int updateByPrimaryKey(T_Order record);
}