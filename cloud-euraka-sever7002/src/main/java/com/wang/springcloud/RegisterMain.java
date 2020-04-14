package com.wang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Mr.Wang
 * @since 2020/4/15 0:14
 */
@SpringBootApplication
@EnableEurekaServer
public class RegisterMain {
    public static void main(String[] args) {
        SpringApplication.run(RegisterMain.class,args);
    }
}
