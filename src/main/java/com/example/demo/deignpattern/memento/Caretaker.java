package com.example.demo.deignpattern.memento;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/28 11:00
 * @Description:  守护者对象 ，保存游戏角色的状态
 */
public class Caretaker {
    // 保存一次状态
    private Memento memento;

    //保存多次状态
    //private ArrayList<Memento> mementos;

    //保存多个角色的多个状态
    //private HashMap<String,ArrayList<Memento>> rolesMementos;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
