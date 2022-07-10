package com.example.demo.mapstruct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author chenyaguo
 * @date 2021/1/29 14:25
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonDTO {

    private Long id;

    private String name;

    private Integer age;

    private String email;

    private Date birth;

    private String birthDateFormat;

    private String birthExpressionFormat;

}
