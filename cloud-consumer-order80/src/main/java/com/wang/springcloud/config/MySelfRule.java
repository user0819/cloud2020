package com.wang.springcloud.config;

import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Mr.Wang
 * @since 2020/4/21 23:03
 */
@Configuration
public class MySelfRule {

    @Bean
    public AbstractLoadBalancerRule randomRule(){
        return new RoundRobinRule();
        //return new RandomRule();
    }
}
