package com.example.demo.mapstruct.ApplicationContentDemo;

import com.example.demo.mapstruct.Person;
import com.example.demo.mapstruct.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * @author chenyaguo
 * @date 2022/1/27 16:06
 */
@Configuration
public class AnnotationApplicationContextAsIoCContainerDemo {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

        applicationContext.register(AnnotationApplicationContextAsIoCContainerDemo.class);
        applicationContext.refresh();
        lookUpCollectionByType(applicationContext);
        applicationContext.close();

    }

    @Bean
    public Person person(){

        Person person = new Person();
        person.setId(1000L);
        person.setName("hahahaha");
        return person;

    }


    public static void  lookUpCollectionByType(BeanFactory beanFactory){

        if(beanFactory instanceof ListableBeanFactory){

            ListableBeanFactory listableBeanFactory =(ListableBeanFactory) beanFactory;
            Map<String, Person> users = listableBeanFactory.getBeansOfType(Person.class);
            System.out.println("查找到的所有的 User 集合对象：" + users);

        }



    }
}


