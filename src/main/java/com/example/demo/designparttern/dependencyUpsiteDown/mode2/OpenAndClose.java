package com.example.demo.designparttern.dependencyUpsiteDown.mode2;


/**
 * @author chenyaguo
 * @date 2021/3/10 14:37
 */
public class OpenAndClose implements  IOpenAndClose {
    public com.example.demo.designparttern.dependencyUpsiteDown.mode2.ITV tv;


    public OpenAndClose(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}
