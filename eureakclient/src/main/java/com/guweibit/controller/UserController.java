package com.guweibit.controller;

import com.guweibit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return userService.findAllUser(pageNum,pageSize);
    }

    @RequestMapping(value = "/doPay", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String doPay( @RequestParam(value = "WIDout_trade_no") String WIDout_trade_no,
                         @RequestParam(value = "WIDsubject") String WIDsubject,
                         @RequestParam(value = "WIDtotal_amount") String WIDtotal_amount,
                         @RequestParam(value = "WIDbody") String WIDbody){

        return "请求成功";
    }

}
