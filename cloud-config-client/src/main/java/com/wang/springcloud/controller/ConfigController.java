package com.wang.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mr.Wang
 * @since 2020/4/29 0:13
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${config.info}")
    private String configInfo;

    //curl -X POST "http://127.0.0.1:3355/actuator/refresh"
    //http://127.0.0.1:3355/configInfo
    @GetMapping("/configInfo")
    public String getConfig(){
        return configInfo;
    }
}
