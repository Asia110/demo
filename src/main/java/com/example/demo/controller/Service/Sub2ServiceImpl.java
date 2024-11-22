package com.example.demo.controller.Service;

import org.springframework.stereotype.Service;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/3/10 14:10
 * @Description:
 */
@Service("sub2Service")
public class Sub2ServiceImpl implements SuperService{
    @Override
    public void sayHello() {
        System.out.println("我是第二个实现-----");
    }
}
