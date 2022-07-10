package com.example.demo.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @author chenyaguo
 * @date 2022/2/17 15:26
 */

public class TransactionTemplateDemo {

    @Autowired
    private static TransactionTemplate transactionTemplate;


    public static void main(String[] args) {
        transactionTemplateWithResult();
    }

    //无返回值的编程事务
    public static void  transactionTemplateWithoutResult(){
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                try {
                    //业务逻辑
                }catch (Exception e){
                    transactionStatus.setRollbackOnly();
                }
            }
        });
    }

    //有返回值的编程事务
    @Deprecated
    public static void transactionTemplateWithResult(){
        transactionTemplate.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus transactionStatus) {
                try {
                    return new Object();
                }catch (Exception e){
                    transactionStatus.setRollbackOnly();
                    return null;
                }
            }
        });
    }
}
