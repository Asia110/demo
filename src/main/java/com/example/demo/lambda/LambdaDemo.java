package com.example.demo.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

/**
 * @author chenyaguo
 * @date 2022/1/4 15:35
 */
public class LambdaDemo {

    public static void main(String[] args) {

        WaybillEntity w1 = new WaybillEntity();
        w1.setOperatr("陈1");
        w1.setWaybillCode("11111");

        WaybillEntity w2 = new WaybillEntity();
        w2.setOperatr("陈2");
        w2.setWaybillCode("22222");

        WaybillEntity w3 = new WaybillEntity();
        w3.setOperatr("陈1");
        w3.setWaybillCode("22222");

        WaybillEntity w4 = new WaybillEntity();
        w4.setOperatr("陈1");
        w4.setWaybillCode("11111");

        WaybillEntity w5 = new WaybillEntity();
        w5.setOperatr("陈2");
        w5.setWaybillCode("11111");

        List<WaybillEntity> list = new ArrayList<>();
        list.add(w1);
        list.add(w2);
        list.add(w3);
        list.add(w4);
        list.add(w5);

        System.out.println(list);
        Collections.sort(list, (x,y)->{
            if(!x.getOperatr().equals(y.getOperatr())){
                return x.getOperatr().compareTo(y.getOperatr());
            }
            return x.getWaybillCode().compareTo(y.getWaybillCode());
        });

        System.out.println(list);
        list.stream().forEach(item->{
            String waybillCode = item.getWaybillCode();
            item.getOperatr();
            System.out.println(waybillCode);
        });

        StringTranslator translator =(x)->{
            return x.toUpperCase().substring(0,3);
        };
        String abcdefg = translator.trans("Abcdefg");
        System.out.println(abcdefg);

        System.out.println("=====================================");
        Function<String,Integer> function = (x)->getInteger(x);
        Integer apply = function.apply("3333");
        System.out.println(apply);

        IntSupplier supplier =()->{ return 100;};
        int asInt = supplier.getAsInt();
        System.out.println(asInt);
    }

    public static Integer getInteger(String x){
        return Integer.valueOf(x);
    }
}
