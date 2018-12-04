package com.guweibit.service;

import com.alibaba.fastjson.JSONObject;
import com.guweibit.entity.Shop;

import java.util.List;

public interface ShopService {
    List<Shop> shopAll(int pageNum, int pageSize);
}
