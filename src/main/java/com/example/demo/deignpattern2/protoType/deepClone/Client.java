package com.example.demo.deignpattern2.protoType.deepClone;

public class Client {


    public static void main(String[] args) throws CloneNotSupportedException {


        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name="wuda";
        deepProtoType.deepCloneTarget = new DeepCloneTarget("金莲","woman");

        //DeepProtoType deepProtoType2 =(DeepProtoType) deepProtoType.clone();
        //System.out.println("deepProtoType Name:"+deepProtoType.name+" deepProtoType2 :"+ deepProtoType.deepCloneTarget.hashCode());
        //System.out.println("deepProtoType Name:"+deepProtoType2.name+" deepProtoType2 :"+ deepProtoType2.deepCloneTarget.hashCode());

        DeepProtoType deepProtoType2 = (DeepProtoType)deepProtoType.deepClone();

        System.out.println("deepProtoType Name:"+deepProtoType.name+" deepProtoType2 :"+ deepProtoType.deepCloneTarget.hashCode());
        System.out.println("deepProtoType Name:"+deepProtoType2.name+" deepProtoType2 :"+ deepProtoType2.deepCloneTarget.hashCode());

    }
}
