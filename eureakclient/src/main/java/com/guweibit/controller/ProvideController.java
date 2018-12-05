package com.guweibit.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
public class ProvideController {
    @RequestMapping(value = "/provide",method = RequestMethod.GET,headers = "Access-Control-Allow-Origin: *")
    @ResponseBody
    public String provide(@RequestParam(value = "name")String name){
        return name+":你好,这里是EurekaClien服务,恭喜你 完成了第一次调用";
    }
    /**
     * 本地访问内容地址 ：http://localhost:8080/lmycc/hello
     * @param map
     * @return
     */
    @RequestMapping("/hello")
    public String helloHtml(HashMap<String, Object> map) {
        map.put("hello", "欢迎进入HTML页面");
        return "/pay";
    }

    /**
     *  进入支付宝的支付页面
     * @param map
     * @return
     */
    @RequestMapping("/demo")
    public String demoHtml(HashMap<String, Object> map) {
        return "/demo";
    }

    /**
     * 进入商品显示页面
     * @param map
     * @return
     */
    @RequestMapping("/shop")
    public String shopHtml(HashMap<String, Object> map) {
        return "/shop";
    }
    /**
     * 进入支付成功页面
     * @param map
     * @return
     */
    @RequestMapping("/success")
    public String ssuccessHtml(HashMap<String, Object> map) {
        return "/success";
    }



}
