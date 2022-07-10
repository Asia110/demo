package com.example.demo.deignpattern.singleton.type6;

/**
 * 懒汉式 double check 线程安全，单效率高 推荐使用这种方式创建
 */
public class SingletonTest06 {
    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }

}

class Singleton {

    private Singleton(){

    }

    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        //Runtime
        return SingletonInstance.INSTANCE;
    }
}

