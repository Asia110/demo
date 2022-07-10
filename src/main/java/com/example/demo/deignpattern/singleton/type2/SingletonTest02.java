package com.example.demo.deignpattern.singleton.type2;

/**
 * 饿汉式 2  静态代码块方式
 */
public class SingletonTest02 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }

}

class Singleton {

    private Singleton(){

    }
    private static final Singleton instance  ;

    static{
        instance = new Singleton();
    }

    public static Singleton getInstance(){
        return instance;
    }
}

