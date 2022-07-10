package com.example.demo.deignpattern.singleton.type5;

/**
 * 懒汉式 double check 线程安全，单效率高 推荐使用这种方式创建
 */
public class SingletonTest05 {
    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }

}

class Singleton {

    private Singleton(){

    }

    private static  Singleton instance ;

    public static  Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

