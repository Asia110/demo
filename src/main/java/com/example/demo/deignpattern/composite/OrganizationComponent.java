package com.example.demo.deignpattern.composite;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/7/30 23:50
 * @Description:
 */
public abstract class OrganizationComponent {

    //名称
    private String name;
    //说明
    private String des;

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    protected void add(OrganizationComponent organizationComponent){
        throw  new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent){
        throw  new UnsupportedOperationException();
    }

    protected abstract void print();

}
