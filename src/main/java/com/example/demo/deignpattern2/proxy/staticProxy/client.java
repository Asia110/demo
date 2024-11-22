package com.example.demo.deignpattern2.proxy.staticProxy;

public class client {

    public static void main(String[] args) {

        ITeacherDao teacherDao = new TeacherDao();

        ITeacherDao proxyTeacher = new TeacherDaoProxy(teacherDao);

        proxyTeacher.teach();


    }
}
