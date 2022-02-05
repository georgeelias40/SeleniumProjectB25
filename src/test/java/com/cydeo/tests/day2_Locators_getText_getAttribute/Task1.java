package com.cydeo.tests.day2_Locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main (String [] args){


        //1. Open Chrome browser

        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();


        //this is a void type
        driver.get("https://practice.cydeo.com");



        //this is return type
        String currentURL= driver.getCurrentUrl();

        String expectedURL = "https://practice.cydeo.com/";

        if (expectedURL.equals(currentURL)){
            System.out.println("currentURL = " + currentURL);
        }else {
            throw new RuntimeException("Invalid URL");
        }

            String expectedTitle = "Practice";

            String currentTitle = driver.getTitle();


            if (expectedTitle.equals(currentTitle)){
                System.out.println("currentTitle = " + currentTitle);
            }else{
                throw new RuntimeException("Invalid Title");
            }






    }
}
/*TC #1: Cydeo practice tool verifications
        1. Open Chrome browser
        2. Go to https://practice.cydeo.com
        3. Verify URL contains
        Expected: cydeo
        4. Verify title:
        Expected: Practice
        */
