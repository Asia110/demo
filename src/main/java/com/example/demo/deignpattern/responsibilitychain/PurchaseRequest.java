package com.example.demo.deignpattern.responsibilitychain;

import lombok.Data;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/9/12 20:57
 * @Description:
 */
@Data
public class PurchaseRequest {

    private int type = 0;
    private float price = 0.0f;
    private int id = 0;

    public PurchaseRequest(int type, float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }
}
