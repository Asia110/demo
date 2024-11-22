package com.example.demo.deignpattern.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/21 9:53
 * @Description:
 */
public class ObjectStructrue {

    List<Person> persons = new LinkedList<>();

    public void addPerson(Person person){
        persons.add(person);
    }

    public void delPersion(Person person){
        persons.remove(person);
    }

    public void display(Action action){
        for (Person p:persons) {
            p.accept(action);
        }
    }


}
