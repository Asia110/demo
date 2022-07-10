package com.example.demo.designparttern.dependencyUpsiteDown.mode2;

/**
 * @author chenyaguo
 * @date 2021/3/10 14:45
 */
public class DependencyPass {

    public static void main(String[] args) {

        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose(changHong);
        openAndClose.open();
    }
}
