package com.guweibit.service;

import com.guweibit.entity.T_Order;
import com.guweibit.vo.T_OrderVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface T_OrderService {
    int deleteByPrimaryKey(String id);

    int insert(T_Order record);

    int insertSelective(T_Order record);

    T_Order selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(T_Order record);

    int updateByPrimaryKey(T_Order record);
    List<T_OrderVO> orderAll(int pageNum, int pageSize,String payStatus);
}
