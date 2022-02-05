package com.cydeo.tests.day2_Locators_getText_getAttribute;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Cydeo_Verifications {

/*
In this class we are solving the day2_task1

 */
    public static void main(String[] args) throws InterruptedException {


         /*TC #1: Cydeo practice tool verifications
        1. Open Chrome browser
        2. Go to https://practice.cydeo.com
        3. Verify URL contains
        Expected: cydeo
        4. Verify title:
        Expected: Practice
        */

//=============================================================================

        //1. Open Chrome browser

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

         //how to maximize our window

        driver.manage().window().maximize();


        Thread.sleep(5000);

        //   2. Go to https://practice.cydeo.com
        // you either use "get()" or "navigate ().to()"
        driver.navigate().to("https://practice.cydeo.com");

        // 3. Verify URL contains
        //Expected: cydeo

        String expectedURL = "cydeo";

        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)){
            System.out.println("URL Verification Passed!");
        }else{
            System.out.println("URL Verification Failed!");
        }


      //  4. Verify title:
      //  Expected: Practice


        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title Verification Passed ! ");
        }else{
            System.out.println("Title Verification Failed !");
        }

//=====================================================================================











    }













}
