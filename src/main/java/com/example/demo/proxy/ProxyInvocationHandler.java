package com.example.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author chenyaguo
 * @date 2021/2/2 14:39
 */
public class ProxyInvocationHandler implements InvocationHandler {

    private Object target;

    public ProxyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("========进入代理调用处理器 ");
        return method.invoke(target,args);
    }
}
