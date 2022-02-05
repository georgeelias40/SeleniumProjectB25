package com.cydeo.tests.day2_Locators_getText_getAttribute.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Back_and_Forth_Navigation {


    public static void main(String[] args) throws InterruptedException {
/*
TC #3: Back and forth navigation
1- Open a Chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
  Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
  Expected: Google
 */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement gmailLinkText = driver.findElement(By.linkText("Gmail"));
        gmailLinkText.click();


        Thread.sleep(3000);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Gmail";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Gmail title verification PASSED !");
        }else {
            System.out.println("Gmail title verification Failed !");
        }

        driver.navigate().back();
        actualTitle = driver.getTitle();
        expectedTitle = "Google";


        System.out.println((actualTitle.equals(expectedTitle)?"Google title verification PASSED"
                :"Google title verification FAILED"));


        Thread.sleep(5000);

        driver.close();











    }
}
