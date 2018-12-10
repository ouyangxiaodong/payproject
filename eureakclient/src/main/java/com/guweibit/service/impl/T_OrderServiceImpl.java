package com.guweibit.service.impl;

import com.github.pagehelper.PageHelper;
import com.guweibit.entity.T_Order;
import com.guweibit.mapper.T_OrderMapper;
import com.guweibit.service.T_OrderService;
import com.guweibit.vo.T_OrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class T_OrderServiceImpl implements T_OrderService {

    @Autowired
    private T_OrderMapper orderMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return orderMapper.deleteByPrimaryKey(id);
    }

    @Transient
    @Override
    public int insert(T_Order record) {
        return orderMapper.insert(record);
    }
    @Transient
    @Override
    public int insertSelective(T_Order record) {
        record.setCreatedate(new Date());
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
    @Transient
    @Override
    public int updateByPrimaryKey(T_Order record) {
        record.setPaytime(new Date());
        return orderMapper.updateByPrimaryKey(record);
    }
    @Override
    public List<T_OrderVO> orderAll(int pageNum, int pageSize,String payStatus) {
        PageHelper.startPage(pageNum,pageSize);
        List<T_OrderVO> list = orderMapper.orderAll(payStatus);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 判空
        if (null != list && list.size()>0) {
            for (int i = 0; i < list.size(); i++) {
                try {
                    if (null != list.get(i).getCreatedate()) {
                        list.get(i).setCreateTimeVo(sdf.format(list.get(i).getCreatedate()));
                    }
                    if (null != list.get(i).getPaytime()) {
                        list.get(i).setPayTimeVo(sdf.format(list.get(i).getPaytime()));
                    }
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
        return list;
    }


}
