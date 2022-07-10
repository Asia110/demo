package com.example.demo.annotion;

import com.google.common.base.Joiner;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.StringJoiner;
import java.util.concurrent.Executors;

/**
 * @author chenyaguo
 * @date 2022/1/11 14:33
 */
@Component
@Aspect
@Slf4j
public class MyLogAspect {

    @Pointcut("@annotation(com.example.demo.annotion.MyLog)")
    public void logPointCut(){};

    @Around("logPointCut()")
    public void logAround(ProceedingJoinPoint joinPoint){
        //获取方法名
        String methodName =joinPoint.getSignature().getName();
        //获取参数列表
        Object[] args = joinPoint.getArgs();
        Joiner joiner = Joiner.on(" - ");
        System.out.println(args+"==========");
        String param = joiner.join(args);
        log.info("进入 方法：["+methodName+"]  参数列表："+param);

        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        log.info("方法：["+methodName+"] 结束");
    }
}
