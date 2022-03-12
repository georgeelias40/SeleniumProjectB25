package com.cydeo.SHORT_VID_PRACTICE.All_Practice.ShortVideos;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class ActionsClass_Demo_HoverAction {


    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //2. Go to http://practice.cybertekschool.com/hovers
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void testPerformHoverAction(){
        driver.get("http://practice.cybertekschool.com/hovers");

        //hove over to the first image
        // identify the first element, verify the text displayed under

        /**
         *  (//div9@class='figure']/img)[1]
         *
         *  //h5[.='name: user1']
         */

        WebElement firstImage = driver.findElement(By.xpath("(//div[@class='figure']/img)[1]"));

        WebElement firstImageText = driver.findElement(By.xpath("//h5[.='name: user1']"));
        System.out.println("BEFORE HOVER firstImageText.isDisplayed() = " + firstImageText.isDisplayed());
        assertFalse(firstImageText.isDisplayed());


        // Creat Actions class object

        Actions actions = new Actions(driver);
        actions.moveToElement(firstImage).perform();

        System.out.println("AFTER HOVER firstImageText.isDisplayed() = " + firstImageText.isDisplayed());
        assertTrue(firstImageText.isDisplayed());

    }



}
