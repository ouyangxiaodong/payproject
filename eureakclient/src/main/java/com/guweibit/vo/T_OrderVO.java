package com.guweibit.vo;

import com.guweibit.entity.T_Order;

/**
 * 订单的VO
 */
public class T_OrderVO extends T_Order {
    // 商品名称
    private String shopName;
    // 订单创建时间， 转换时间格式一致有问题，所以将时间定义在VO中为String类型
    private String createTimeVo;

    // 订单创建时间， 转换时间格式一致有问题，所以将时间定义在VO中为String类型
    private String payTimeVo;

    public String getCreateTimeVo() {
        return createTimeVo;
    }

    public void setCreateTimeVo(String createTimeVo) {
        this.createTimeVo = createTimeVo;
    }

    public String getPayTimeVo() {
        return payTimeVo;
    }

    public void setPayTimeVo(String payTimeVo) {
        this.payTimeVo = payTimeVo;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}
