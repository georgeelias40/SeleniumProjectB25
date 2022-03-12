package com.cydeo.tests.day5_testNG_intro_dropdowns.HomeWork;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T7_non_SelectDropDown {
    WebDriver driver;


    //TC #7: Selecting value from non-select dropdown
    //1. Open Chrome browser
    @BeforeMethod
    public void navigateToChrome(){
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }
    @Test

    public void navigateToCydeo(){

        //2. Go to https://practice.cydeo.com/dropdown

        driver.get("https://practice.cydeo.com/dropdown");

        //3. Click to non-select dropdown

        WebElement nonSelectedDropdown = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        nonSelectedDropdown.click();


        //4. Select Facebook from dropdown
        WebElement selectFacebook = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/']"));
        selectFacebook.click();
        //5. Verify title is “Facebook - Log In or Sign Up”

        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - Log In or Sign Up";

        Assert.assertEquals(actualTitle,expectedTitle,"Title did not match !!");


    }


    @AfterMethod

    public void tearDownMethod(){
        driver.close();
    }

}
