package com.wang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Mr.Wang
 * @since 2020/4/14 0:12
 */
@SpringBootApplication
@EnableConfigServer
public class SeverConfigMain {
    public static void main(String[] args) {
        SpringApplication.run(SeverConfigMain.class,args);
    }
}
