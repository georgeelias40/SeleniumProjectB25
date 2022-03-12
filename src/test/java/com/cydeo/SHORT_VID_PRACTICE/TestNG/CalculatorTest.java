package com.cydeo.SHORT_VID_PRACTICE.TestNG;

import org.testng.annotations.*;

import static org.testng.AssertJUnit.assertEquals;






    public class CalculatorTest {

    @BeforeClass
    public  void init(){
        System.out.println("@BeforeClass: Run once before class");
    }

    @BeforeMethod
    public void setup(){
        System.out.println("@BeforeMethod: Run before each test");
    }


    @Test
    //we created a method to calculate
    public void testOnePlusFive(){

    // 1 + 5 = 6
        assertEquals(1+5,6);
        System.out.println("Test 1 is running");

    }
    @Test
    public void test10Minus4(){
        assertEquals(10-4,6);
    }

        @AfterMethod
        public void afterMeth() {
            System.out.println("@AfterMethod: Run before each test");
        }

    @AfterClass
        public void runAfter(){
        System.out.println("Run After");
    }
}
