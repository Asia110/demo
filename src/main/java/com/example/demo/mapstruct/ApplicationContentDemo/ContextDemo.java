package com.example.demo.mapstruct.ApplicationContentDemo;

import com.example.demo.mapstruct.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.util.CollectionUtils;

import java.util.Map;

/**
 * @author chenyaguo
 * @date 2022/1/27 15:38
 */
public class ContextDemo {


    public static void main(String[] args) {


        DefaultListableBeanFactory  beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);

        String location ="classpath:/dependency-lookup-context.xml";
        int count = reader.loadBeanDefinitions(location);

        System.out.println("Bean 定义加载的数量："+ count);

        lookupCollectionByType(beanFactory);

    }

    public static void lookupCollectionByType(BeanFactory beanFactory){

        if(beanFactory instanceof ListableBeanFactory){
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory)beanFactory;
            Map<String, User> users = listableBeanFactory.getBeansOfType(User.class);
            System.out.println("查找到的所有user 集合对象："+ users);
         }
    }

}
