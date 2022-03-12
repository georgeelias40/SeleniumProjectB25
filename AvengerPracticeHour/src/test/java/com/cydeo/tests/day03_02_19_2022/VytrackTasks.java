package com.cydeo.tests.day03_02_19_2022;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class VytrackTasks {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        //TC #1: Facebook title verification
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2- Go to “https://vytrack.com/”
        driver.get("“https://vytrack.com/");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        // driver.close();
    }


    //TC 1- As a user I should be able to see the labels [“Home”,”About us”,”Our
    //Approach”,”Products and Services”,”Contact”,”LOGIN”]
    //1- Open a chrome browser
    //2- Go to “https://vytrack.com/”
    //3- Verify that [“Home”,”About us”,”Our Approach”,”Products and Services”,”Contact”,”
    //LOGIN”] is displayed












}

















