package com.example.demo.deignpattern.proxy.dynamicProxy.cglib;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/8 21:21
 * @Description:
 */
public class Client {

    public static void main(String[] args) {

        TeachDao teachDao = new TeachDao();

        ProxyFactory factory = new ProxyFactory(teachDao);

        TeachDao proxyInstance =(TeachDao) factory.getProxyInstance();
        proxyInstance.teach();
    }
}
