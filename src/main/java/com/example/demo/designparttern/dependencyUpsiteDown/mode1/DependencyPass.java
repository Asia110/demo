package com.example.demo.designparttern.dependencyUpsiteDown.mode1;

import com.example.demo.designparttern.dependencyUpsiteDown.mode1.ChangHong;
import com.example.demo.designparttern.dependencyUpsiteDown.mode1.OpenAndClose;

/**
 * @author chenyaguo
 * @date 2021/3/10 14:21
 */
public class DependencyPass {

    public static void main(String[] args) {

        // 1、通过接口传递实现依赖
        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(changHong);


    }
}
