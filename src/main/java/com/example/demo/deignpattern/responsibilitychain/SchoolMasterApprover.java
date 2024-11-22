package com.example.demo.deignpattern.responsibilitychain;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/9/12 21:21
 * @Description:
 */
public class SchoolMasterApprover extends Approver{

    public SchoolMasterApprover(String name){
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {

        if(request.getPrice() > 10000){
            System.out.println("请求编号："+request.getId()+" 被 "+this.name+"处理。。。");
        }else {
            approver.processRequest(request);
        }
    }
}
