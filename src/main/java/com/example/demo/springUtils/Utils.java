package com.example.demo.springUtils;

import com.example.demo.mapstruct.Person;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author chenyaguo
 * @date 2022/2/18 9:40
 */
public class Utils {

    public static void main(String[] args) throws InterruptedException {
        //assertTest();
        ObjectUtilsTest();

        Thread.sleep(0);
        System.out.println(Thread.currentThread().getName());
    }


    /**
     * 断言工具方法
     */
    public static void assertTest() {
//        String name = null;
//        Assert.notNull(name, "姓名不能为空！");

//        Integer age =10 ;
//        Assert.isNull(age,"姓名必须为空");

//        Integer age = -10;
//        Assert.isTrue( age < 0,"年龄不能为负数");

//        List<String> list = new ArrayList<>();
//        Assert.notEmpty(list,"集合不能为空！！");

//        String text ="";
//        Assert.hasLength(text,"文本不能为空！！");

//        String text ="  123";
//        Assert.hasText(text,"文本必须有内容！！");

//        Assert.isInstanceOf(String.class,10,"此类型不是字符串类型！！！");

        Assert.isAssignable(Person.class,String.class,"要求参数 `subType` 必须是参数 superType 的子类或实现类");

    }

    /**
     * 对象、数组、集合  工具方法
     */
    public static void ObjectUtilsTest(){

//        String name ="";
//        System.out.println(ObjectUtils.nullSafeClassName(name));

//        String name =null;
//        System.out.println(ObjectUtils.nullSafeHashCode(name));

        System.out.println(ObjectUtils.nullSafeToString(new String[]{"1","2","3"}));

        System.out.println(ObjectUtils.identityToString(123));

        System.out.println(ObjectUtils.getDisplayString(123));

        String [] strs =new String[]{"1","2","3"};
        System.out.println(ObjectUtils.containsElement(strs,"5"));

        System.out.println(ObjectUtils.nullSafeEquals(1,1));

    }

}
