package com.example.demo.mapstruct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Optional;

/**
 * @author chenyaguo
 * @date 2021/1/29 14:21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private Long id;

    private String name;

//    private String email;
//
//    private Date birthday;
//
//    private User user;



//    public Optional<String> getName() {
//        return Optional.ofNullable(name);
//    }


}
