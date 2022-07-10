package com.example.demo;

import com.example.demo.assembler.Assembler;
import com.example.demo.assembler.PO.Product;
import com.example.demo.assembler.PO.ProductDTO;
import com.example.demo.mapstruct.Person;
import com.example.demo.mapstruct.PersonConverter;
import com.example.demo.mapstruct.PersonDTO;
import com.example.demo.mapstruct.User;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author chenyaguo
 * @date 2021/2/1 14:10
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MapStructTest {

    @Resource
    Assembler assembler;

    @Test
    public void test01(){
//        Person person = new Person(1L,"chen","122356152@qq.com",new Date(),new User(1));
//
//        PersonDTO personDTO = PersonConverter.INSTANCE.domain2dto(person);
//        Assert.assertNotNull(personDTO);
//        Assert.assertEquals(personDTO.getId(),person.getId());
//        Assert.assertEquals(personDTO.getName(),person.getName());
//       // String format = DateFormatUtils.format(personDTO.getBirth(), "yyyy-MM-dd HH:mm:ss");
       // System.out.println("format"+format);
    }

    @Test
    public void test02(){

        ProductDTO productDTO = new ProductDTO();
        productDTO.setProductId("1111");
        productDTO.setProductName("产品名称1");
        Product product = assembler.toDto(productDTO);
        System.out.println(product);
        System.out.println(productDTO.sayHello());

    }


    @Test
    public void test03(){




    }

    class ProductFactory{

        ProductDTO productDTO ;


    }

}
