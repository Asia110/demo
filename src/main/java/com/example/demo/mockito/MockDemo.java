package com.example.demo.mockito;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * @author chenyaguo
 * @date 2021/1/29 11:16
 */
public class MockDemo {

    @Test
    public void test_spy(){

        ExampleService exampleService =spy(new ExampleService());
        Assert.assertEquals(3,exampleService.add(1,2));

        //when(exampleService.add(1,2)).thenReturn(10);
       // System.out.println(exampleService.add(1,2));
        //Assert.assertEquals(10,exampleService.add(1,2));

    }

    @Test
    public void test_mock(){

        ExampleService exampleService = mock(ExampleService.class);
        //默认返回结果是返回值类型int的默认值。
        Assert.assertEquals(0,exampleService.add(1,2));

    }


}
