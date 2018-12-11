package com.guweibit.pay;

import com.guweibit.controller.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * AlipayController Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>12/11/2018</pre>
 */
public class AlipayControllerTest extends BaseTest {


    /**
     * 模拟mvc测试对象
     */
    private MockMvc mockMvc;

    /**
     * web项目上下文
     */
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void before() throws Exception {
        System.out.println("测试支付controller");
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: goPay(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "WIDout_trade_no") String WIDout_trade_no, @RequestParam(value = "WIDsubject") String WIDsubject, @RequestParam(value = "WIDtotal_amount") String WIDtotal_amount, @RequestParam(value = "WIDbody") String WIDbody, @RequestParam(value = "number") String number, @RequestParam(value = "payType") String payType)
     */
    @Test
    public void testGoPay() throws Exception {
//TODO: Test goes here...
        Map<String, String> map = new HashMap<String, String>();
        map.put("WIDout_trade_no", "2018121115558717");
        map.put("WIDsubject", "测试商品");
        map.put("WIDtotal_amount", "0.01");
        map.put("WIDbody", "购物");
        map.put("number", "1");
        map.put("payType", "alipay");
        MvcResult reset = mockMvc.perform(MockMvcRequestBuilders.post("/goPay").accept(MediaType.APPLICATION_FORM_URLENCODED).contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("WIDout_trade_no", "2018121115558714")
                .param("WIDsubject", "测试商品")
                .param("WIDtotal_amount", "0.01")
                .param("WIDbody", "购物")
                .param("number", "1")
                .param("payType", "alipay")
        ).andReturn();
        System.out.print(reset);

        int status = reset.getResponse().getStatus();
        Assert.assertEquals("请求错误", 200, status);
    }

    /**
     * Method: returnUrl(HttpServletRequest request, HttpServletResponse response)
     */
    @Test
    public void testReturnUrl() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: notifyUrl(HttpServletRequest request, HttpServletResponse response)
     */
    @Test
    public void testNotifyUrl() throws Exception {
//TODO: Test goes here... 
    }


} 
