package com.example.demo.designparttern.dependencyUpsiteDown.mode1;

/**
 * @author chenyaguo
 * @date 2021/3/10 14:26
 */
public class OpenAndClose implements IOpenAndClose {
    @Override
    public void open(ITV itv) {
        itv.play();
    }
}
