package com.guweibit.config;

import java.io.FileWriter;
import java.io.IOException;
public class AlipayConfig {

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016091200491987";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCUw2T0/05NLFB50/ELpqeCbLGvxw1JcNKWYCByYdJSZMbXTqQrce5LcLwmpWfUkrVa/fZ7ifiqlalqDFcNRb9GFRKz95QwhqSxLukAB3QsszJYutW7qcDrOYqMxvPtUKKI8cxYlgcOdO0+6BQ5aM4NZo/d6r1foV8AJXA/rIVMWzpM3GlyUIUb+T62zKs8gtbAWl73y22biQqWrv9kM8nRUL+czdX2/jPgGku3Iwapk9U5X6mW4zaoTmFO0xwIWv0veAmgK8r8TGbkuMaemwltvBUccOMTQOeLk6QDTymVkOS7jQomU96v5r20aZOoKUJvD2eM/JwGfykwc5FC2KgFAgMBAAECggEAZWwFw4bgUnsY7sZRe5kGcUQ7rFSwOVbDLCSjWnhY1TXB3v7NrJUDWsmkbVCtxl6zaDLnPfil4V8h3pxFKVZY/qXVV38+uArD88zAq/Vo/iS5+YZ/u28TiQt061+k5DHqbiU0JV07uF59dTrytuU+PiKjiS/GJpG1XDsqGS88vf4V60n0ulH3QuenV4d1VHF7BFH2ehkOO7KrkNUImmMwlrR0iiC1LMrMje/CMwGA8oVUPxFBJuRMzwqq0+9XroyTcBmG2iMJEx8102+D4qFb1FouQg9UzvgfnGgF5QiRlg61C8iWSt9kENaB2hEd6DfbqJGi+cWGQ0KsGIlPDKx8jQKBgQDOq+YClM0yxE8++tkb9ts6rUQkDSJkh1XV5bD8KzcL4bVvAn/ZL6EGWieWtyE0ISEr7cKjx7yMzL9TGhOi7lCXEqmIWiJezZmkVUdOxGzUn60QvNAg2wVLiFHCmvDB6AQpPoKewxXGCnuCyVNhy5VPDTMl1baAUTdgl9Gra3H9YwKBgQC4RSu7YS858+Kd083yPn5yPp0vHobFaL1Khg1I8sGVvnzGcxih7cq6zYlURp/9ymYNUCR9Znni4x54smgN8YOs5Y0wW5Mc4ppkiRNnsbkaoOMerpsWU7qoagA8X+0yqMOQKjMsSq6W+A7WgtyIftyc7WUhprlkMvUcSqhCi35VdwKBgQDCsCpgGh7niQiB8rqdXkGNF/XN5FWWz+qrMdI06tzTI4/QAFHBnd2Z50nN77umqOLfx/2IXbsgBCzjsvf2j3t5pUnxOb+RASuQJAmliOJgtf7JeqSxnsFxMvyaT20nrVJmLA3OU0ZqpitNvCwBP0/rBSs+pAFlBZ0eMEaCrhfWswKBgHiiD/cjsF8oIntgZbro3q67/vsR6PjjkMhw6dGP2tvFULo6Ly4TFl0koXrioWrsTdL5XGob5D98oD4zzZsTOTi/LqcxzCVk095tPp7r4lpkaUt002LSfagzfOQJiKdZhG2kssuUOKfszQnxsZ5KLvMtFr/o/gVytrRGy9CEsbgRAoGANzReCL7J7b7wPBLbF+kRqYfi8u0F/wslXywEy723Z6n+jYb+XBFk2wnpujGstxoz50y9zOAE2fxhkB8UIPyys7WwGPHLzPOuWB+hwj2hVmgktF9YqAP0oY4QCjZ+KvJYIdKApoeJHKi0Oy9ee5UsvIAaycSIoFb58f3d0Dh6zmY=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlMNk9P9OTSxQedPxC6angmyxr8cNSXDSlmAgcmHSUmTG106kK3HuS3C8JqVn1JK1Wv32e4n4qpWpagxXDUW/RhUSs/eUMIaksS7pAAd0LLMyWLrVu6nA6zmKjMbz7VCiiPHMWJYHDnTtPugUOWjODWaP3eq9X6FfACVwP6yFTFs6TNxpclCFG/k+tsyrPILWwFpe98ttm4kKlq7/ZDPJ0VC/nM3V9v4z4BpLtyMGqZPVOV+pluM2qE5hTtMcCFr9L3gJoCvK/Exm5LjGnpsJbbwVHHDjE0Dni5OkA08plZDku40KJlPer+a9tGmTqClCbw9njPycBn8pMHORQtioBQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://ubvtnt.natappfree.cc/notifyUrl";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://ubvtnt.natappfree.cc/returnUrl";
    // 签名方式
    public static String sign_type = "RSA2";
    // 字符编码格式
    public static String charset = "utf-8";
    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
