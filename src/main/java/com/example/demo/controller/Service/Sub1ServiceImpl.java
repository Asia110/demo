package com.example.demo.controller.Service;

import org.springframework.stereotype.Service;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/3/10 14:08
 * @Description:
 */
@Service("sub1Service")
public class Sub1ServiceImpl implements SuperService{
    @Override
    public void sayHello() {
        System.out.println(" 我是第一个实现-------------");
    }
}
