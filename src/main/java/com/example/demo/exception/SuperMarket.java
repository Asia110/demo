package com.example.demo.exception;

/**
 * @author chenyaguo
 * @date 2021/1/30 16:48
 */
public class SuperMarket {

    public void haveommodity(int a){

        if(a ==1){
            throw new RuntimeException("商店异常！！");
        }
        Supplier supplier= new Supplier();
     // try {
           supplier.supplierGoods(1);
      //  }catch (Exception e){
      //      e.printStackTrace();
      //  }


        System.out.println( "我是商店  我有许多商品！！");
    }
}
