# cloudTest

一个非常粗糙的 支付宝沙箱支付的demo
 
启动项目之前，先将db文件夹中的 sql 在mysql 中执行完毕。

然后在修改AlipayConfig 文件中的 异步通知地址和同步跳转页的穿透域名。
<br/>
![image](https://github.com/ouyangxiaodong/payproject/blob/master/eureakclient/db/60E03212-C481-4a1b-87B4-7335089B5A34.png)


启动项目之后，访问 http://localhost:8090/demo 进入支付页面。点击付款生成支付二维码，这个时候将创建订单，扫码支付完毕之后 等待跳转页面，将会修改支付订单的状态。 




