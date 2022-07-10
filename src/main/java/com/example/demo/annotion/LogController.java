package com.example.demo.annotion;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenyaguo
 * @date 2022/1/11 15:03
 */
@RestController
public class LogController {

    @MyLog
    @RequestMapping("/hello")
    public String hello(String name, int age){
        return "success";
    }
}
