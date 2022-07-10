package com.example.demo.mapstruct;

/**
 * @author chenyaguo
 * @date 2022/1/21 10:01
 */
public class GenCopyMethodDemo {


    public static void main(String[] args) {


    }


    public static PersonVo transPerson(PersonDTO dto){
        PersonVo personVo = new PersonVo();
        personVo.setId(dto.getId());
        personVo.setName(dto.getName());
        personVo.setAge(dto.getAge());
        personVo.setEmail(dto.getEmail());
        personVo.setBirth(dto.getBirth());
        personVo.setBirthDateFormat(dto.getBirthDateFormat());
        personVo.setBirthExpressionFormat(dto.getBirthExpressionFormat());
        return personVo;

    }
}
