package com.cydeo.SHORT_VID_PRACTICE.All_Practice.ShortVideos;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {




    @DataProvider(name = "myData")
    public Object [] [] provideData(){
        return new Object[][]{
                {"Adam"},
                {"John"},
        };
    }

    @Test(dataProvider = "myData")
    public void testMultipleData(String name){

        System.out.println(name);

    }


    @DataProvider(name = "TwoSetOfData")
    public Object [] [] provide2Data () {
            return new Object[][]{
                    {"Adam", 20},
                    {"Alice", 25 },
                    {"Mary", 26}
            };
    }

    @Test()
    public void testNameAndBatch(String name, int batchNumber){
        System.out.println(name + " is from batch" + batchNumber);
    }












}
