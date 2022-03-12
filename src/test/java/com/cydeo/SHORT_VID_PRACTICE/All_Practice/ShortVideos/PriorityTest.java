package com.cydeo.SHORT_VID_PRACTICE.All_Practice.ShortVideos;

import org.testng.annotations.Test;

public class PriorityTest {



    @Test(priority = 3)
    public void test1(){
        System.out.println("test1 is running");
    }



    @Test(priority = 4)
    public void test2(){
        System.out.println("test2 is running");
    }



    @Test(priority = 1)
    public void test3(){
        System.out.println("test3 is running");
    }



    @Test(priority = 2)
    public void test4(){
        System.out.println("test4 is running");
    }






}
