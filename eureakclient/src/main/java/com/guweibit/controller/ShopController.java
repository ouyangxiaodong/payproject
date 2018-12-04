package com.guweibit.controller;

import com.guweibit.service.ShopService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    private ShopService shopService;
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object shopAll(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return shopService.shopAll(pageNum, pageSize);
    }
}
