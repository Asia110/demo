package com.example.demo.deignpattern2.singleton.type1;

/**
 * 单例模式-饿汉模式
 */
public class SingletonTest1 {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1==instance2);

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

    }


}

class Singleton{

    private static final Singleton singleton = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return singleton;
    }
}
