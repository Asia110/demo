package com.example.demo.redis;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenyaguo
 * @date 2021/12/12 15:43
 */
@Configuration
public class MyRedisConfig {

    @Bean(destroyMethod = "shutdown")
    public RedissonClient redisson(){
        Config config = new Config();
        config.useSingleServer().setAddress("redis://39.98.95.39:6379");
        RedissonClient redissonClient = Redisson.create(config);
        return redissonClient;
    }
}
