package com.example.demo.thread;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * @author chenyaguo
 * @date 2021/12/29 20:31
 */

@ConfigurationProperties("my.thread")
@Component
@Data
public class MyThreadPoolExecutorConfig {

   // @Value("${my.thread.coreSize}")
    private Integer coreSize;

    //@Value("${my.thread.maxSize}")
    private Integer maxSize;

   // @Value("${my.thread.activeTime}")
    private Long activeTime;
}
