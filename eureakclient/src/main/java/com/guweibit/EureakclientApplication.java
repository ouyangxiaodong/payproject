package com.guweibit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.guweibit.mapper")
//@EnableDiscoveryClient 还可以使用这个注解 ，与上面的区别就是 @EnableEurekaClient只能使用在eureka中 EnableDiscoveryClient而可以使用在别的框架中。
public class EureakclientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EureakclientApplication.class, args);
    }
}
