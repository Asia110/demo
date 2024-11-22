package com.example.demo.deignpattern2.composite;

public class Department extends OrganizationComponent{


    public Department(String name, String des) {
        super(name, des);
    }

    public String getName(){
        return super.getName();
    }

    public String getDes(){
        return super.getDes();
    }
    @Override
    protected void print() {
        System.out.println(getName());
    }
}
