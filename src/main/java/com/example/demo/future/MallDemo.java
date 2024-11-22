package com.example.demo.future;

import lombok.Getter;
import sun.nio.ch.Net;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/9/12 21:20
 * @Description:
 */
public class MallDemo {

    static List<NetMall> netMalls = Arrays.asList(
            new NetMall("jd"),
            new NetMall("dangdang"),
            new NetMall("taobao"),
            new NetMall("douyin"),
            new NetMall("PDD")
    );

    static List<String> getPrice(List<NetMall> netMalls, String productName) {

        return netMalls.stream().map(netMall -> String.format(productName + "  in %s price is %.2f", netMall.getNetMallName(), netMall.calcPrice(productName))).collect(Collectors.toList());
    }

    static List<String> getPriceWithCompletableFuture(List<NetMall> netMalls, String productName) {
        return netMalls.stream().map(netMall -> CompletableFuture.supplyAsync(()->{
                        return String.format(productName + "  in %s price is %.2f", netMall.getNetMallName(), netMall.calcPrice(productName));
                }))
                .collect(Collectors.toList())
                .stream()
                .map(completableFutrue->completableFutrue.join())
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();
        List<String> list = getPrice(netMalls, "java");
        list.stream().forEach(item -> {
            System.out.println(item);
        });
        long end = System.currentTimeMillis();
        System.out.println(end- starttime + "毫秒");
        System.out.println("=====================");
        List<String> list2 = getPriceWithCompletableFuture(netMalls, "java");
        list2.stream().forEach(item -> {
            System.out.println(item);
        });
        System.out.println(System.currentTimeMillis()-end+" 毫秒");

        NetMall netMall = new NetMall("11");
        NetMall netMall1 = new NetMall("11");
        netMall1.equals(netMall1) ;

    }
}


class NetMall {


    @Getter
    private String netMallName;

    public NetMall(String netMallName) {
        this.netMallName = netMallName;
    }

    public Double calcPrice(String productName) {

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return ThreadLocalRandom.current().nextDouble() * 2 + productName.charAt(0);
    }

}
