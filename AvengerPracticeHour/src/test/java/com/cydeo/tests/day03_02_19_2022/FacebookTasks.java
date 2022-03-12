package com.cydeo.tests.day03_02_19_2022;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FacebookTasks {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){

        //TC #1: Facebook title verification
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
       // driver.close();
    }


    @Test
    public void TC1_verifying_Title(){


        //3. Verify title:
        //Expected: “Facebook – log in or sign up”
        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }

    @Test
    public void TC2_verifying_login_title() {

        //3. Enter incorrect username
        driver.findElement(By.xpath("//input[@ide='email']")).sendKeys("incorrect");
        //4. Enter incorrect password

        driver.findElement(By.xpath("//div[@id='passContainer']/input")).sendKeys("incorrect"+ Keys.ENTER);
        //5. Verify title changed to:
        String expectedTitle = "Log into Facebook";
        String actualTitle = driver.getTitle();

        //Expected: “Log into Facebook”
        Assert.assertEquals(actualTitle,expectedTitle);



    }

    @Test
    public void TC3_verifying_Header() {
        //TC #3: Facebook header verification
        //3. Verify header text is as expected:

        String expectedHeader="Facebook helps you connect and share the people in your life.";
        String actualHeader = driver.findElement(By.cssSelector("h2._8eso")).getText();

        //Expected: “Facebook helps you connect and share with the people in your life.”

        Assert.assertEquals(actualHeader,expectedHeader,"Verifying Header");

    }

    @Test
    public void TC4_verifying_link_attribute(){
        //TC #4: Facebook header verifica.on
        //3. Verify “Create a page” link href value contains text:
        String expectedWord="registration_form";
        String actualAtributeValue=  driver.findElement(By.xpath("//a[contains(@href,'regist')]")).getAttribute("href");
        Assert.assertTrue(actualAtributeValue.contains(expectedWord));
        //Expected: “registration_form”
    }



}
