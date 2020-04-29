package com.wang.springcloud.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Mr.Wang
 * @since 2020/4/27 23:37
 */
@SpringBootTest
@RunWith(JUnit4.class)
public class PaymentDaoTest {

    @Test
    public void zoneTime(){
        ZonedDateTime dateTime = ZonedDateTime.now();
        System.out.println(dateTime);
    }

}