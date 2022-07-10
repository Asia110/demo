package com.example.demo.config;

import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @author chenyaguo
 * @date 2022/2/16 17:44
 */
@Configuration
public class RedissonConfig {

    public RedissonConfig(){
        System.out.println("================RedissonConfig RedissonConfig RedissonConfig====");
    }

    @PostConstruct
    public void init(){
        System.out.println("===========================init==========");
    }
}
