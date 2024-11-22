package com.example.demo.deignpattern2.protoType.shallowClone;

public class Client {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("duoli",12,"白色");
        sheep.friend = new Sheep("jieke",10,"黑色");

        Sheep sheep2 = (Sheep)sheep.clone();
        Sheep sheep3 = (Sheep)sheep.clone();
        Sheep sheep4 = (Sheep)sheep.clone();
        Sheep sheep5 = (Sheep)sheep.clone();

        System.out.println("sheep2 "+sheep2.hashCode()+" sheep2.friend"+sheep2.friend.hashCode());
        System.out.println("sheep3 "+sheep3.hashCode()+" sheep3.friend"+sheep3.friend.hashCode());
        System.out.println("sheep4 "+sheep4.hashCode()+" sheep4.friend"+sheep4.friend.hashCode());
        System.out.println("sheep5 "+sheep5.hashCode()+" sheep5.friend"+sheep5.friend.hashCode());


    }
}
