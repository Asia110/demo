package com.example.demo.mockito;

import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.runners.statements.ExpectException;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import static org.mockito.Mockito.when;

/**
 * @author chenyaguo
 * @date 2021/1/29 13:42
 */
public class MockDemo2 {

    @Spy
    private ExampleService exampleService;

    @Test(expected =IndexOutOfBoundsException.class)
    public void test_spy(){

        MockitoAnnotations.initMocks(this);
        Assert.assertEquals(3,exampleService.add(1,2));

        when(exampleService.add(1,2)).thenReturn(10);
        Assert.assertEquals(10,exampleService.add(1,2));
        System.out.println(exampleService.add(1,2));

        int [] a ={};

        System.out.println(a[2]);
    }

}
