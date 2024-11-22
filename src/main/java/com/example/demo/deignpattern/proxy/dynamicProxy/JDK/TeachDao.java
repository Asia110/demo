package com.example.demo.deignpattern.proxy.dynamicProxy.JDK;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/8 0:10
 * @Description:
 */
public class TeachDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("正在教学。。。");
    }
}
