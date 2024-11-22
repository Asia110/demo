package com.example.demo.deignpattern.responsibilitychain;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/9/12 21:22
 * @Description:
 */
public class client {

    public static void main(String[] args) {
        PurchaseRequest request = new PurchaseRequest(1,10000,1);

        DepartmentApprover departmentApprover = new DepartmentApprover("第一位老师");
        CollegeApprover collegeApprover = new CollegeApprover("第二位老师");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("第三位老师");

        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);

        departmentApprover.processRequest(request);


    }
}
