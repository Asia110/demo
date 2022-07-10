package com.example.demo.annotion;

import java.lang.annotation.*;

/**
 * @author chenyaguo
 * @date 2022/1/6 9:53
 */
@Documented
@Target({ElementType.FIELD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    String name() default "chen";
}
