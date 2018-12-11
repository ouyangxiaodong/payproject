package com.guweibit.controller;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * UserController Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>12/11/2018</pre>
 */
public class UserControllerTest extends BaseTest {
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
        System.out.println("测试用户controller");
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize)
     */
    @Test
    public void testFindAllUser() throws Exception {
//TODO: Test goes here...
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/user/all/1/100")).andReturn();
        int status = mvcResult.getResponse().getStatus();
        String responseString = mvcResult.getResponse().getContentAsString(); // 6

        Assert.assertEquals("请求错误", 200, status);
    }
} 
