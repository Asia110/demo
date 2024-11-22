package com.example.demo.deignpattern2.singleton.type2;


/**
 * 单例模式-饿汉模式 静态代码块
 */
public class SingletonTest2 {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);

        System.out.println(instance1.hashCode() +"  " +instance2.hashCode() );

    }
}

class Singleton{

    private Singleton(){}


    private  static  Singleton singleton ;

    static {
        singleton = new Singleton();
    }

    public static Singleton getInstance(){
        return singleton;
    }

}
