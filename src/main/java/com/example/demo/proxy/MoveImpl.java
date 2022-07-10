package com.example.demo.proxy;

/**
 * @author chenyaguo
 * @date 2021/2/2 19:29
 */
public class MoveImpl implements Move {
    @Override
    public String play() {
        System.out.println("看电影啦 开始放电影啦!");
        return "success";
    }
}
