package com.example.demo.deignpattern.visitor;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/21 9:57
 * @Description:
 */
public class Client {

    public static void main(String[] args) {

        Action success = new Success();

        Woman woman = new Woman();
        Woman woman1 = new Woman();


        Man man = new Man();

        ObjectStructrue objectStructrue = new ObjectStructrue();

        objectStructrue.addPerson(woman);
        objectStructrue.addPerson(woman);
        objectStructrue.addPerson(man);

        Action fial= new Fail();
        Wait wait = new Wait();
        objectStructrue.display(wait);

    }
}
