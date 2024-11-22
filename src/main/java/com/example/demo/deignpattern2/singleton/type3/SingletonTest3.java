package com.example.demo.deignpattern2.singleton.type3;

/**
 * 单例模式-懒汉
 *
 * 不推荐 存在线程安全问题
 */
public class SingletonTest3 {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);

        System.out.println(instance1.hashCode()+" "+ instance2.hashCode());


    }
}
class Singleton{

    private Singleton(){}

    private static  Singleton singleton;

    public static Singleton getInstance(){

        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }


}
