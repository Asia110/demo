package com.example.demo.proxy;

import java.lang.reflect.Proxy;

import static java.lang.reflect.Proxy.newProxyInstance;

/**
 * @author chenyaguo
 * @date 2021/2/2 14:48
 */
public class ProxyTest {

    public static void main(String[] args) {

        Subject subject =  new SubjectImpl();
        Subject proxy = (Subject) newProxyInstance(
                        subject.getClass().getClassLoader(),
                        subject.getClass().getInterfaces(),
                        new ProxyInvocationHandler(subject)
                        );
        proxy.sayHello();
        proxy.sayYes();

        MoveImpl move =new MoveImpl();

        Move move1 =(Move) Proxy.newProxyInstance(move.getClass().getClassLoader(),
                                move.getClass().getInterfaces(),
                                new ProxyInvocationHandler(move)
                         );
        move1.play();
    }

}
