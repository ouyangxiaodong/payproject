package com.guweibit.service.impl;

import com.github.pagehelper.PageHelper;
import com.guweibit.entity.Shop;
import com.guweibit.mapper.ShopMapper;
import com.guweibit.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "shopService")
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopMapper shopMappe;

    @Override
    public List<Shop> shopAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return shopMappe.shopAll();
    }
}
