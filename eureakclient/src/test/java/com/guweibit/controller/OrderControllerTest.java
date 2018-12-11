package com.guweibit.controller;

import com.alibaba.fastjson.JSONObject;
import com.guweibit.entity.T_Order;
import com.guweibit.service.T_OrderService;
import com.guweibit.service.impl.T_OrderServiceImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Date;

/**
 * OrderController Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>12/11/2018</pre>
 */

public class OrderControllerTest extends BaseTest {

    /**
     * 模拟mvc测试对象
     */
    private MockMvc mockMvc;

    /**
     * web项目上下文
     */
    @Autowired
    private WebApplicationContext webApplicationContext;


    private T_OrderService t_orderService = new T_OrderServiceImpl();


    @Before
    public void before() throws Exception {
        System.out.println("测试订单controller");
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: articles(@RequestBody T_Order order)
     */
    @Test
    public void testArticles() throws Exception {
//TODO: Test goes here...
        T_Order order = new T_Order();
        order.setId("20181211143639816");
        order.setSumprice("0.01");
        order.setPayType("alipay");
        order.setUserId("1");
        order.setShopId("3");
        order.setNumber("1");
        order.setCreatedate(new Date());
        String jsonString = JSONObject.toJSONString(order);
        System.out.println(jsonString);
        //   {"+"id"+":"+"20181211143639815"+","+"userId"+":"+"1"+","+"shopId"+":"+3+","+"number"+":"+"1"+","+"payStatus"+":"+"0"+","+"payType"+":"+"alipay"+","+"sumprice"+":"+"0.01"+"}";
        mockMvc.perform(
                MockMvcRequestBuilders.post("/order/articles")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .accept(MediaType.APPLICATION_JSON_UTF8).
                        content(jsonString)).
                andExpect(MockMvcResultMatchers.status()
                        .isOk()).andDo(MockMvcResultHandlers.print());

        // mockMvc.perform(MockMvcRequestBuilders.get("/order/articles").params());
        //   t_orderService.insert(order);
    }

    /**
     * Method: orderAll(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize)
     */
    @Test
    public void testOrderAll() throws Exception {
//TODO: Test goes here...

        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/order/all/1/100")).andReturn();
        int status = mvcResult.getResponse().getStatus(); // 5
        String responseString = mvcResult.getResponse().getContentAsString(); // 6

        String json = "{}";


        Assert.assertEquals("请求错误", 200, status); // 7
        // Assert.assertEquals("返回结果不一致", "/order/all/1/100", responseString); //


    }

    /**
     * Method: orderPayAll(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize)
     */
    @Test
    public void testOrderPayAll() throws Exception {
//TODO: Test goes here...
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/order/payAll/1/100")).andReturn();
        int status = mvcResult.getResponse().getStatus(); // 5
        String responseString = mvcResult.getResponse().getContentAsString(); // 6

        Assert.assertEquals("请求错误", 200, status);
    }


} 
