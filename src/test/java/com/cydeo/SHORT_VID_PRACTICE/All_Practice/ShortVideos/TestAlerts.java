package com.cydeo.SHORT_VID_PRACTICE.All_Practice.ShortVideos;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestAlerts {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //2. Go to http://practice.cybertekschool.com/javascript_alerts
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @Test
    public void testAlert(){
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

       driver.findElement(By.xpath("//*[@id=\"content\"]/div/button[1]")).click();

        driver.switchTo().alert().accept(); // click on button


        WebElement confirmBtn =  driver.findElement(By.xpath("//button[.='click for JS Confirm']"));
        confirmBtn.click();
     //   driver.findElement(By.xpath("//button[.='click for JS Prom']"));




    }


}
