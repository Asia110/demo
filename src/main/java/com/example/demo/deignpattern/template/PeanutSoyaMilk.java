package com.example.demo.deignpattern.template;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/9 11:46
 * @Description:
 */
public class PeanutSoyaMilk extends SoyaMilk{
    @Override
    void addCondiments() {
        System.out.println("第二步：添加花生。。。");
    }
}
