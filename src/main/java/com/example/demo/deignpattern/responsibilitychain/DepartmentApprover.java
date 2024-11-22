package com.example.demo.deignpattern.responsibilitychain;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/9/12 21:06
 * @Description:
 */
public class DepartmentApprover extends Approver{

    public DepartmentApprover(String name){
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {

        if(request.getPrice() <= 5000){
            System.out.println("请求编号："+request.getId()+" 被 "+this.name+"处理。。。");
        }else {
            approver.processRequest(request);
        }

    }
}
