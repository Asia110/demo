package com.example.demo.thread;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author chenyaguo
 * @date 2022/1/11 17:02
 */
public class ListTest {

    public static void main(String[] args) {

        List<String> arrayList= new CopyOnWriteArrayList<>();
       // List<String> arrayList= new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                arrayList.add(UUID.randomUUID().toString().substring(0,5));
                System.out.println(arrayList);
            },String.valueOf(i)).start();
        }


       // Assert.notNull(null, "这个结果不能是个null");
        System.out.println(ObjectUtils.isEmpty("  "));

        System.out.println(new Date().getTime());
        System.out.println(System.currentTimeMillis());

        String Str ="{1}111{0}";
        String format = MessageFormat.format(Str, 222,333);
        System.out.println(format);
    }
}
