package com.cydeo.tests.day2_Locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_Google_Search {

    public static void main(String[] args) throws InterruptedException {

/*
TC#3: Google search
1- Open a chrome browser
2- Go to: https://google.com/
3- Write “apple” in search box
4- Click google search button
5- Verify title:
Expected: Title should start with “apple” word
 */


      // TC#3: Google search
      //  1- Open a chrome browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

//2- Go to: https://google.com/

        driver.get("https://google.com/");



        //3- Write “apple” in search box

        //4- Click google search button (Press ENTER using Keys.Enter)
        WebElement googleSearchBox = driver.findElement(By.name("q"));

        googleSearchBox.sendKeys("apple" + Keys.ENTER);


     //   5- Verify title:
     ///   Expected: Title should start with “apple” word


       String expectedInTitle = "apple";
       String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expectedInTitle)) {

            System.out.println("Title Verification Passed !");
        }else{
            System.out.println("Title Verification Failed !");
        }

        Thread.sleep(5000);
        driver.close();



    }
}
