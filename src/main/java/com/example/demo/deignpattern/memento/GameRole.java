package com.example.demo.deignpattern.memento;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/28 11:17
 * @Description:
 */
public class GameRole {

    private int vit;//攻击力

    private int def;//防御力

    public Memento createMemento() {
        return new Memento(vit, def);
    }


    public void recoverGameRoleFromMemento(Memento memento) {
        this.def = memento.getDef();
        this.vit = memento.getVit();
    }

    public void display(){
        System.out.println("当前游戏角色攻击力为："+vit+"  防御力："+def);
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
