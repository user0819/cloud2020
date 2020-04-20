package com.wang.springcloud.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.wang.springcloud.entity.CommonResult;
import com.wang.springcloud.entity.Payment;

import lombok.extern.slf4j.Slf4j;

/**
 * @auther zzyy
 * @create 2020-02-18 17:23
 */
@RestController
@Slf4j
public class OrderController {
    public static final String PAYMENT_URL = "http://cloud-payment-service";

    // public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;
    /*
    @Resource
    private LoadBalancer loadBalancer;
    @Resource
    private DiscoveryClient discoveryClient;*/

    @GetMapping("/consumer/zk")
    public String test() {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/zk", String.class);
    }


}
