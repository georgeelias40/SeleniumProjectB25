package com.cydeo.tests.day2_Locators_getText_getAttribute.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etsy_Title_Verification {
    public static void main(String[] args) throws InterruptedException {

        /*
TC #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon | Etsy”
         */


      //  TC #1: Etsy Title Verification
      //  1. Open Chrome browser

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //how to maximize our window

        driver.manage().window().maximize();


    //    2. Go to https://www.etsy.com

        driver.get("https://www.etsy.com ");


    //3. Search for “wooden spoon”
        WebElement searchBox = driver.findElement(By.id("global-enhancements-search-query"));
        searchBox.sendKeys("wooden spoon" + Keys.ENTER);




        String actualTitle = driver.getTitle();
        String expectedTitle = "Wooden spoon";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title Verification Passed !");
        }else{
            System.out.println("Title Verification Failed !");







        }

        Thread.sleep(5000);
        driver.close();


    }
}
