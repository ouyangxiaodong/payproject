package com.guweibit.config;

import java.io.FileWriter;
import java.io.IOException;
public class AlipayConfig {

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016091200491987";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCTSs9xrymaFtQDL5ywvQsa3VV8yB/zH6jaLtPpMVM//TLyczm3mhdASsv3TplCzCa81QCbdrsnZlqiMg8GIMVP1k1aAwM9Sh7WFPZ9pKDkoVBEedilmTvZjkd8KU8bYDESMydlPi3eiau5nkR8kR65pZLZqKhGeWwImRMAI8SJkJYSpa7V4k7Gh9liVupsqpAzQnwOrTM3MiEGjZL5qdeuYrtwB3urJ0pZmJC/zkAGeCeW4uvE5pAQK4QzydYolZ9NODA8oEfsUdjdkp4ZH/nl134aoX6fjh7f+bPQkONEfL3LhRDhEBCqR6KUq8LirfRnNHAegWYK8nhNX8Q73WUpAgMBAAECggEAQz+qyvrwgZvenL3GSqNlSJS5jUlJ3RUdYNB0jEmq+tI9yph1R7Cg4QfFbFqEewz+usR9jH1/IZQH2XoFhgS8UaFEm844Umle/tt/VwotM3W7UihXk/QMcV4WoUezCIq4nNiiKgVjp/EvaIYsOrt/Tb+c9qecfOC/RIWvOScberrFbeKywerGZ6jf+dHnE3Y5TTlgU+qMkybChWsqHF/acGUvSuhl15wgHXiPZFNtElvi6xNKesmLqrxf/d/xjhK6SUWYAfWdgDCDqlBOUIHD4PDGRxs253qe5FVT1KpYn5bU/KtCrTRYzTf2xPokvYoXRdNbryK3GlPF2H23YpMWKQKBgQDxGVUlD4wL3ByCwmCDtbJuRPFKnDmUz9bfuwCXXHpZSKOhaFScASjuJfIokhqIay0acgqftllXjUt8Sb3HyXtVhvyqnxAtzX7knXesNlTNHE3hQEijNf4HtYublWg/dkgkZu3njcTcr9cAB+Ryuck6dJg6px3OrEN+KiOXRBjyVwKBgQCcZUSODBpnYDf5S283JrGpiqONj/6+0JiEC1FwqINvIdXlex2599Uf586/Z1NNDqpd3bqqFPw3iJKhhNoul3bkA6mfC+YbeU7FjAcXLmg8JaQtCFRBC/OoOdhnpN61adYJu2BKowXivPy9v6RopgUt5MMJy2Jf1dIsW0uCIKi0fwKBgDVLi0XI/QU2H9tLynfy90Fm3gvHIvdhRjdoqAXNfII2C23HmURvATQ7kR8kxNa5ElxRL0YE0hUHd9M+ncQHJstOLpYs2S+2yEETCfw4emBozFJpmmTxr3jWyciXq1az99iMJDTWYtkByb4JAJfXt8LDOU9l17Hy5GyENh/e/sC7AoGAEeeqHJUYJMOoRNs1BVxhtKZRqTBWGuRowZ1GGp7ARWXbRiV9NsA/3yI70j/zEnxeVta+uyAh6/2vw9wg2nquutYMgk/rbTPLJ+SrHyVJ+7DXhexRMQ08PQM6WktOz/go7/5KvODDGL1INjUNjomLSEDLb4CgZ5ZkNH3TPDee+OMCgYBMK5uQCP0X6S/s+8VlUccO1mgVHN3d23p3sWTxg6uUOcR+5ALy49ba7orVKo/DBux8UGW9wgV0CMM+BGS3lOF99dm9c5I1Wy5UwJgJGFW0hoUonRe3fR1w0zqt3UWeIKdFDe3l7S0IVXYszaVWZNGB290JW1VvbPdsVB2apjxrMg==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxBQZwRvlvGyIdMkloP7CqLxonzYYiNxO7PkkIUiR6dJAqho7AaoJQv7dcflUkeLbo4yM2h8srxvAOOvh/mmSwHT65mk57P4mna4+ECTCjdZgdGNSzf8mz2gERIl04000XVZLe817wTanicWtbzR6JcG2Zd2ha6EWQLc8q0F/8qD3ZJJwpqFgF8Yh5C3b6V1tniNQqdhd/k2NrkSOCk1aAcjROhaZa+NXq641J+cmOu4kZwBoNk5h36sgeB3kb6bI2FcUaYDuEGgXUE5ajYKc3L8DhtcelaOcUIuX/2KNpMxDOIm33qdON+ZCEvgV6ddlQapwVigi1mlQAAFCKa1NEQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://se95mr.natappfree.cc/notifyUrl";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://se95mr.natappfree.cc/returnUrl";
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
