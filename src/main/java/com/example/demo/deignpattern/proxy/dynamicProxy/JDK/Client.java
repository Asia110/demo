package com.example.demo.deignpattern.proxy.dynamicProxy.JDK;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/8 17:22
 * @Description:
 */
public class Client {


    public static void main(String[] args) {
        ITeacherDao t = new TeachDao();

        ITeacherDao proxy = (ITeacherDao) new ProxyFactory(t).getProxyInstance();
        System.out.println("代理对象:"+ proxy.getClass());
        proxy.teach();

    }

}
