package com.cydeo.SHORT_VID_PRACTICE.x_pATH;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Testing_In_browser {
    public static void main(String[] args) {

        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //navigate to ("https://search.yahoo.com");
        driver.navigate().to("https://search.yahoo.com");


        //use

        WebElement searchBox = driver.findElement(By.xpath("//input[@name='p']"));
        searchBox.sendKeys("xpath");


        driver.findElement(By.xpath("//button//span[@class='sprite']")).click();

       driver.findElement(By.xpath("\"//span[@title='Search']\""));





    }
}
