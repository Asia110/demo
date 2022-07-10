package com.example.demo.designparttern.dependencyUpsiteDown.mode2;

import com.example.demo.designparttern.dependencyUpsiteDown.mode2.ITV;

/**
 * @author chenyaguo
 * @date 2021/3/10 14:24
 */
public class ChangHong implements ITV {
    @Override
    public void play() {
        System.out.println("长虹电视机 打开");
    }
}
