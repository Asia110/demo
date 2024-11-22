package com.example.demo;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

    public static void main(String [] args){

        Executors.newFixedThreadPool(10);

        System.out.println(newTimeRangeHoursAgo(new Date(),168));

        Integer a =1;
        System.out.println(a.equals(1));

    }
    static class A{
        protected int value;
        public A(int v) {
            setValue(v);
        }
        public void setValue(int value){
            this.value = value;
        }
        public int getValue(){
            try{
                value++;
                return value;
            } catch(Exception e){
                System.out.println(e.toString());
            } finally {
                this.setValue(value);
                System.out.println(value);
            }
            return value;
        }
    }
    static class B extends A{
        public B() {
            super(5);
            setValue(getValue() - 3);
        }
        public void setValue(int value){
            super.setValue(2 * value);
        }
    }

    class demo{

//        public void demo(){
//
//            if(航空/航填 单据){
//                https://cf.jd.com/pages/viewpage.action?pageId=43687961
//                目的网点信息==  调用青龙基础资料接口
//                if(目的网点信息.分拣中心 ==当前的操作场地 ){
//                    https://cf.jd.com/pages/viewpage.action?pageId=446932958
//                    调用基础资料获取滑道号信息
//
//                }else{现有逻辑
//                    根据单据类型判断获取当前场地到目的分拣中心的对应类型的航空或者航填的滑道号信息
//                     if(滑道号信息为空) {
//                         兜底取陆运的滑道号信息
//                     }
//                }
//
//            }
//        }
//

    }

    public static Date newTimeRangeHoursAgo(final Date date, Integer rangeHours) {
        if (date == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY, - rangeHours);

        return calendar.getTime();
    }
}
