package com.example.demo.mapstruct;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author chenyaguo
 * @date 2022/1/27 15:20
 */
@Data
@AllArgsConstructor
public class SuperUser extends Person{

    private String address;

    public SuperUser(){
        super();
    }

}
