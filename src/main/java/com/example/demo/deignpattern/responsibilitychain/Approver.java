package com.example.demo.deignpattern.responsibilitychain;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/9/12 21:01
 * @Description:
 */
public abstract class Approver {

    String name;

    Approver approver;

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void processRequest(PurchaseRequest request);
}
