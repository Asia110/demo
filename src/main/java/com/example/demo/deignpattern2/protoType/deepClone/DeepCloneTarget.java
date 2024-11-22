package com.example.demo.deignpattern2.protoType.deepClone;

import java.io.Serializable;

public class DeepCloneTarget implements Serializable,Cloneable {

    private static final  long serialVersionUID = 1L;

    private String cloneName;

    private String cloneClass;

    public DeepCloneTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
