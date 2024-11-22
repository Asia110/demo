package com.example.demo.deignpattern2.singleton.type4;

/**
 * 单例模式-懒汉模式
 *
 * 线程安全，但是效率低 每次都得进入同步方法判断
 * 不推荐
 */
public class SingletonTest4 {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode()+" "+instance2.hashCode());

    }
}

class Singleton{

    private Singleton(){}

    private static Singleton singleton;

    public static synchronized Singleton getInstance(){

        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

}
