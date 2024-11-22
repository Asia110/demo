package com.example.demo.deignpattern.memento;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/28 11:24
 * @Description:
 */
public class Client {

    public static void main(String[] args) {

        GameRole gameRole = new GameRole();
        gameRole.setDef(100);
        gameRole.setVit(100);
        System.out.println("PK 前的状态===============");
        gameRole.display();

        //保存当前角色状态
        Memento memento = gameRole.createMemento();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(memento);

        System.out.println("开始 PK------------");

        gameRole.setVit(40);
        gameRole.setDef(40);

        gameRole.display();

        gameRole.recoverGameRoleFromMemento(memento);

        System.out.println("回复后的状态--------");
        gameRole.display();



    }
}
