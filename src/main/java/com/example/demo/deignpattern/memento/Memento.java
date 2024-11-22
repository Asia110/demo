package com.example.demo.deignpattern.memento;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/28 10:56
 * @Description:
 */
public class Memento {

    private int vit;//攻击力

    private int def;//防御力

    public Memento(int vit, int def) {
        this.vit = vit;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
