package com.example.demo.annotion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chenyaguo
 * @date 2022/1/6 10:03
 */
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@MyAnnotation(name = "33333")
public class ChenPerson {

    private int age ;

    private String name ;

    private String addresss;
}
