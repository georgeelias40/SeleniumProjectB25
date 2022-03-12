package com.cydeo.SHORT_VID_PRACTICE.All_Practice.ShortVideos;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DependsOnTest {


    @Test
    public void test1(){
        System.out.println("test1 is running");
        assertEquals(2,3);
    }



    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 is running");
    }



    @Test(dependsOnMethods = {"test1", "test2"})
    public void test3(){
        System.out.println("test3 is running");
    }


}
