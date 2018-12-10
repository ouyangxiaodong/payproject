package com.guweibit.mapper;

import com.guweibit.entity.T_Order;
import com.guweibit.vo.T_OrderVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface T_OrderMapper {
    int deleteByPrimaryKey(String id);

    int insert(T_Order record);

    int insertSelective(T_Order record);

    T_Order selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(T_Order record);

    int updateByPrimaryKey(T_Order record);

    /**
     * 添加查询条件，支付状态
     * 通过判断支付状态是否为空来判断查询的范围
     * @param payStatus
     * @return
     */
    List<T_OrderVO> orderAll(@Param(value = "payStatus") String payStatus);

}