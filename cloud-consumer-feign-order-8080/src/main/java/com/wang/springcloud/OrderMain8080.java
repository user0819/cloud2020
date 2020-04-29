package com.wang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @auther zzyy
 * @create 2020-02-18 17:20
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class OrderMain8080
{
    public static void main(String[] args) {
            SpringApplication.run(OrderMain8080.class, args);
    }
}
