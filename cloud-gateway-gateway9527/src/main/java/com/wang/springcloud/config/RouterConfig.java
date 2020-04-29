package com.wang.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Mr.Wang
 * @since 2020/4/25 14:09
 */
@Configuration
public class RouterConfig {

    @Bean
    public RouteLocator routeLocator1(RouteLocatorBuilder builder){
        RouteLocatorBuilder.Builder locators = builder.routes();
        RouteLocator locator = locators.route("router-baidu",r->r.path("/baidu").uri("http://news.baidu.com/guonei")).build();
        return locator;
    }
}
