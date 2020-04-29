package com.wang.springcloud.controller;

import com.wang.springcloud.entity.CommonResult;
import com.wang.springcloud.service.IFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mr.Wang
 * @since 2020/4/22 21:25
 */
@RestController
@Slf4j
public class OrderController {
    @Autowired
    private IFeignService feignService;

    @GetMapping("/consumer/get/{id}")
    public CommonResult get(@PathVariable Long id){
        return feignService.getPaymentById(id);
    }
}
