package com.cydeo.SHORT_VID_PRACTICE.All_Practice.ShortVideos;

import org.testng.annotations.Test;

public class IgnoringTest {




    @Test(enabled = false)// ==> meaning is to ignore this test
    public void test1(){
        System.out.println("test1 is running");
    }



    @Test
    public void test2(){
        System.out.println("test2 is running");
    }



    @Test
    public void test3(){
        System.out.println("test3 is running");
    }
}
