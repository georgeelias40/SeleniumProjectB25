package com.cydeo.tests.day2_Locators_getText_getAttribute.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Cydeo_Class_locator_Practice {
    public static void main(String[] args) throws InterruptedException {
        /*
        TC #4: Practice Cydeo – Class locator practice
        1- Open a Chrome browser
        2- Go to: https://practice.cydeo.com/inputs
        3- Click to “Home” link
        4- Verify title is as expected:
          Expected: Practice

PS: Locate “Home” link using “className” locator
         */



        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //how to maximize our window

        driver.manage().window().maximize();


      //  2. Go to https://practice.cydeo.com/inputs

        driver.get("https://practice.cydeo.com/inputs");

      //  3- Click to “Home” link

        WebElement homeLink = driver.findElement(By.linkText("Home"));

        homeLink.click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Practice";

        System.out.println(actualTitle.equals(expectedTitle)?"Passed":"Failed");



        Thread.sleep(5000);
        driver.close();






    }
}
