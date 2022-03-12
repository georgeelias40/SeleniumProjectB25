package com.cydeo.SHORT_VID_PRACTICE.TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleHomePageTEst {

    @Test
    public void testHomePage() throws InterruptedException {
        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();


        driver.get("https://google.com");
        Thread.sleep(2000);


        // assert the title is Google

        Assert.assertEquals(driver.getTitle(),"Google");
        Thread.sleep(2000);



        driver.close();


    }

}
