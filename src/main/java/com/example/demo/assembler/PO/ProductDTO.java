package com.example.demo.assembler.PO;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chenyaguo
 * @date 2021/12/28 19:57
 */
@Data
public class ProductDTO implements Serializable {

    private String productId;
    private String productName;

    public String sayHello(){
        return "hello";
    }
}
