package com.example.demo.deignpattern2.protoType.deepClone;

import java.io.*;

public class DeepProtoType implements Serializable,Cloneable {

    public String name;

    public DeepCloneTarget deepCloneTarget;



    public DeepProtoType(){
        super();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Object deep = null;
        deep = super.clone();
        DeepProtoType deepProtoType = (DeepProtoType)deep;
        deepProtoType.deepCloneTarget= (DeepCloneTarget) deepCloneTarget.clone();
        return deepProtoType;
    }

    public Object deepClone(){

        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {

            //序列化
            bos = new ByteArrayOutputStream();
            oos= new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj =(DeepProtoType)ois.readObject();

            return copyObj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e2){
                System.out.println(e2.getMessage());
            }
        }

    }
}
