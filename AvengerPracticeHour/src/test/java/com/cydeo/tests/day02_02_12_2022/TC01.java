package com.cydeo.tests.day02_02_12_2022;

import com.cydeo.tests.utilities.WebDriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC01 {
    public static void main(String[] args) {
        //AC:1 As a user I should be able to see Home is displayed

        //        1-open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //        2-goto https://vytrack.com/
        driver.get("https://vytrack.com/");
        //driver.navigate().to("https://vytrack.com/");
        //        3-verify Home is displayed
        WebElement homeWebElement = driver.findElement(By.xpath("//ul[@id='top-menu']/li[1]/a"));
        if (homeWebElement.isDisplayed()){
            System.out.println("PASSED");
        }else {
            System.err.println("FAILED");
        }
        driver.close();
    }
}