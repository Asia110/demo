package com.example.demo.mapstruct;

import org.mapstruct.MapMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author chenyaguo
 * @date 2021/1/29 14:29
 */
@Mapper
public interface PersonConverter {

//    PersonConverter INSTANCE = Mappers.getMapper(PersonConverter.class);
//
//    @Mappings({
//        @Mapping(source = "birthday",target ="birth" ),
//        @Mapping(source = "birthday",target = "birthDateFormat",dateFormat = "yyyy-MM-dd HH:mm:ss"),
//        @Mapping(target = "birthExpressionFormat",expression = "java(org.apache.commons.lang3.time.DateFormatUtils.format(person.getBirthday(),\"yyyy-MM-dd HH:mm:ss\"))"),
//        @Mapping(target = "email",ignore = true),
//        @Mapping(source = "user.age",target = "age")
//    })
//
//    PersonDTO domain2dto(Person person);
//
//    List<PersonDTO> domain2dto(List<Person> personList);

}
