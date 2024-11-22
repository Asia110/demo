package com.example.demo.deignpattern2.proxy.dynamicProxy.JDK;

import com.example.demo.deignpattern.proxy.dynamicProxy.JDK.ITeacherDao;
import com.example.demo.deignpattern.proxy.dynamicProxy.JDK.TeachDao;

public class client {

    public static void main(String[] args) {


        ITeacherDao teacher = new TeachDao();

        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(teacher).getProxyInstance();

        proxyInstance.teach();

        System.out.println("代理对象："+ proxyInstance.getClass());
    }
}
