package com.example.demo.deignpattern.template;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/9 11:44
 * @Description:
 */
public class RedBeanSoyaMilk extends SoyaMilk{
    @Override
    void addCondiments() {
        System.out.println("第二步  添加 花生");
    }
}
