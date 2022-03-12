package com.cydeo.SHORT_VID_PRACTICE.All_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        //navigate to google.com
        driver.get("https://google.com");


        // identify and save the search box element and enter Selenium
        WebElement searchBox = driver.findElement(By.name("q"));
        Thread.sleep(2000);
        searchBox.sendKeys("Selenium");
        Thread.sleep(4000);


        //Get tag name of the element
        System.out.println("searchBox.getTagName() = " + searchBox.getTagName());



        //Get value attribute of the element
        System.out.println("searchBox.getAttribute(\"value\") =" +
                " " + searchBox.getAttribute("value"));



        //identify and save the search button element
        WebElement searchBtn = driver.findElement(By.name("btnK"));



        // Get tag name of the element get class attribute
        System.out.println("searchBox.getTagName() = " + searchBox.getTagName());
        System.out.println("searchBtn.getAttribute(\"class\") = " + searchBtn.getAttribute("class"));




        //Click on the search button
        searchBtn.submit();
        Thread.sleep(2000);


        // identify the element that hold search result number
        WebElement searchResult = driver.findElement(By.id("result-stats"));



        //get the text of that element
            String resultText = searchResult.getText();
            System.out.println("resultText = " + resultText);
             Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().refresh();
            driver.close();
    }
}
