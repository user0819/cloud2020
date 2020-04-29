package com.wang.springcloud.service;

import com.wang.springcloud.entity.CommonResult;
import com.wang.springcloud.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Mr.Wang
 * @since 2020/4/22 21:23
 */
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
@Service
public interface IFeignService {
    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
}
