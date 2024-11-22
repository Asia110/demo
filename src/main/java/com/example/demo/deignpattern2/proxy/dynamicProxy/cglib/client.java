package com.example.demo.deignpattern2.proxy.dynamicProxy.cglib;

public class client {

    public static void main(String[] args) {
        TeachDao teachDao = new TeachDao();

        ProxyFactory proxyFactory = new ProxyFactory(teachDao);
        TeachDao proxyInstance =(TeachDao) proxyFactory.getProxyInstance();
        proxyInstance.teach();

    }
}
