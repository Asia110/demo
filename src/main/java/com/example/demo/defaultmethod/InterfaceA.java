package com.example.demo.defaultmethod;

/**
 * @author chenyaguo
 * @date 2021/3/3 9:28
 */
public interface InterfaceA {

    default void foo(){
        System.out.println("InterfaceA 中的默认方法 foo");
    }
}
