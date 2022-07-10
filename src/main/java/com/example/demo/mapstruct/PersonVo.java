package com.example.demo.mapstruct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author chenyaguo
 * @date 2022/1/21 10:00
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonVo {

    private Long id;

    private String name;

    private Integer age;

    private String email;

    private Date birth;

    private String birthDateFormat;

    private String birthExpressionFormat;
}
