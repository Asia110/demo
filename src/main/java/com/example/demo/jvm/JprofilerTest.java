package com.example.demo.jvm;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/2/6 20:45
 * @Description:
 */
public class JprofilerTest {

    public static void main(String[] args) {
        while (true){
            ArrayList list = new ArrayList();
            for (int i = 0; i < 500; i++) {
                Data data = new Data();
                list.add(data);
            }
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
class Data{

    private int size = 10;
    private byte[] buffer = new byte[1024* 1024];

    private String info ="hello,word";
}