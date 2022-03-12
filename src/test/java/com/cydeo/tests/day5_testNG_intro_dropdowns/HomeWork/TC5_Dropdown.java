package com.cydeo.tests.day5_testNG_intro_dropdowns.HomeWork;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC5_Dropdown {
    WebDriver driver;



    //TC #5: Selecting state from State dropdown and verifying result
    //1. Open Chrome browser

        @BeforeMethod
        public void navigatingToChrome() {
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //2. Go to http://practice.cybertekschool.com/dropdown
         driver.get("http://practice.cybertekschool.com/dropdown");
        }


    //3. Select Illinois
    @Test
    public void dropDownSelection() {
        Select dropDownSelectBtn = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        dropDownSelectBtn.selectByVisibleText("Illinois");

        //4. Select Virginia
        dropDownSelectBtn.selectByValue("VA");

        //5. Select California
        dropDownSelectBtn.selectByIndex(5);
        //6. Verify final selected option is California.
        String actualSelection = dropDownSelectBtn.getFirstSelectedOption().getText();
        String expectedSelection = "California";

        Assert.assertEquals(actualSelection,expectedSelection,"This Selection Was not Expected !");
        //Use all Select options. (visible text, value, index)



    }
    @AfterMethod
    public void tearDownMethod(){
            driver.close();
    }

    }
