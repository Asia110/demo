package com.example.demo.deignpattern.template;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/9 11:47
 * @Description:
 */
public class PureSoyaMilk extends  SoyaMilk{
    @Override
    void addCondiments() {

    }

    @Override
    boolean isNeedAddCondiments() {
        return false;
    }
}
