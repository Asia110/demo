package com.example.demo.annotion;

import javax.xml.transform.Source;

/**
 * @author chenyaguo
 * @date 2022/1/6 10:04
 */
public class MyAnnotationDemo {

    public static void main(String[] args) {

        try {
            //获取Person的Class对象
            ChenPerson person = ChenPerson.builder().build();
            Class clazz = person.getClass();
            //判断person对象上是否有Info注解
            if (clazz.isAnnotationPresent(MyAnnotation.class)) {
                System.out.println("Person类上配置了Info注解！");
                //获取该对象上Info类型的注解
                MyAnnotation infoAnno = (MyAnnotation) clazz.getAnnotation(MyAnnotation.class);
                System.out.println("person.name :" + infoAnno.name() + ",person.isDelete:" );
            } else {
                System.out.println("Person类上没有配置Info注解！");
            }

            System.out.println(person.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
