package com.example.demo.deignpattern.proxy.staticProxy;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/8 0:11
 * @Description:
 */
public class TeachDaoProxy implements ITeacherDao {

    private TeachDao teachDao;

    public TeachDaoProxy(TeachDao teachDao) {
        this.teachDao = teachDao;
    }


    @Override
    public void teach() {
        System.out.println("代理中得 teach。。。");
        teachDao.teach();
        System.out.println("代理结束。。");
    }
}
