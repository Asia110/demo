package com.example.demo.jvm;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/12/6 17:49
 * @Description:
 */
public class OOMTest {

    public static void main(String[] args) {
        ArrayList<Picture> list = new ArrayList<>();
        while (true){
            list.add(new Picture(new Random().nextInt(100* 50*20)));
        }
    }

}

class Picture{

    private byte []pixels;

    public Picture(int length){
        this.pixels =new byte[length];
    }
}
