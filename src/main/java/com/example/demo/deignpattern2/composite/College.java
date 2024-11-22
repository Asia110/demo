package com.example.demo.deignpattern2.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{

    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }


    public String getName(){
        return super.getName();
    }

    public String getDes(){
        return super.getDes();
    }

    protected void add(OrganizationComponent organizationComponent){
        organizationComponents.add(organizationComponent);
    }

    protected void remove(OrganizationComponent organizationComponent){
        organizationComponents.remove(organizationComponent);
    }

    @Override
    protected void print() {
        System.out.println("=========="+getName()+"==============");
        organizationComponents.forEach(e->{
            e.print();
        });
    }
}
