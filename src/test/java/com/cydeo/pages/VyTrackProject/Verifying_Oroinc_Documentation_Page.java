package com.cydeo.pages.VyTrackProject;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.module.Configuration;
import java.util.Set;

public class Verifying_Oroinc_Documentation_Page {



    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        VyTrack_LoginPage vyTrack_loginPage = new VyTrack_LoginPage();

        vyTrack_loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("driver_username"));
        vyTrack_loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("driver_password"));
        vyTrack_loginPage.loginButton.click();



    }

    @Test

    public void VerifyingOroincDocumentationTest(){

        WebElement getHelpBtn = Driver.getDriver().findElement(By.xpath("//i[@title='Get help']"));
        getHelpBtn.click();







        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();
        // window handle 1 - main window
        // window handle 2 - 2nd window

        for (String each : allWindowHandles) {
            System.out.println("each = " + each);

            Driver.getDriver().switchTo().window(each);
            if (Driver.getDriver().getTitle().equals("Welcome to Oro Documentation")) {
                System.out.println("Current title while switching windows: " + Driver.getDriver().getTitle());
                break;
            }

        }
        //7. Assert: Title is “New Window”
        String expectedTitleAfterClick = "Welcome to Oro Documentation";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitleAfterClick) );

        System.out.println("Title after click: " + actualTitle);

    }








}
