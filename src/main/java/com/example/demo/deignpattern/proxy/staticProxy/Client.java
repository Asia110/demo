package com.example.demo.deignpattern.proxy.staticProxy;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/8 0:09
 * @Description:
 */
public class Client {

    public static void main(String[] args) {

        TeachDaoProxy proxy = new TeachDaoProxy(new TeachDao());
        proxy.teach();
    }
}
