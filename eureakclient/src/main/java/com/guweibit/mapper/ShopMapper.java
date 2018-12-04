package com.guweibit.mapper;

import com.guweibit.entity.Shop;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ShopMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
    List<Shop> shopAll();
}