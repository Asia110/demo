package com.example.demo.thread;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.*;

/**
 * @author chenyaguo
 * @date 2021/12/29 20:02
 */


@Configuration
@Slf4j
public class MyThreadPoolExecutor {


    @Bean
    public ThreadPoolExecutor threadPoolExecutor(MyThreadPoolExecutorConfig config){
        log.info("MyThreadPoolExecutorConfig====="+ JSON.toJSONString(config));
        return new ThreadPoolExecutor(config.getCoreSize(),config.getMaxSize(),config.getActiveTime(), TimeUnit.SECONDS
                ,new LinkedBlockingDeque<>(1000),Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
    }
}
