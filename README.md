# cloudTest

一个非常粗糙的 支付宝沙箱支付的demo
使用SpringBoot + MyBatis + Vue + ElementUi 
新加入的代码中有 kafka  所以启动之前需要启动kafka 并且修改配置文件中的kafka的ip地址
要不然是启动不了的、

 <div style="color:red">注意:付款的时候 微信选项是无效的假的。</div>
 
启动项目之前，先将db文件夹中的 sql 在mysql 中执行完毕。

然后在修改AlipayConfig 文件中的 异步通知地址和同步跳转页的穿透域名。
<br/>
![image](https://github.com/ouyangxiaodong/payproject/blob/master/eureakclient/db/60E03212-C481-4a1b-87B4-7335089B5A34.png)


启动项目之后，访问 http://localhost:8090/shop 进入支付页面。点击付款生成支付二维码，这个时候将创建订单，扫码支付完毕之后 等待跳转页面，将会修改支付订单的状态。 

第一次打开支付页面进行支付时，支付成功页面可能不会自动跳转页面，别慌。
![image](https://github.com/ouyangxiaodong/payproject/blob/master/eureakclient/src/main/resources/static/2105997987-5bf774f488497_articlex.jpg)
