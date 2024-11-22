package com.example.demo.deignpattern2.proxy.staticProxy;

public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("我是老师  我来教课");
    }
}
