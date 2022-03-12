package com.cydeo.tests.day5_testNG_intro_dropdowns.HomeWork;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T8_Selecting_Value_from_Multiple_Select_Dropdown {

    WebDriver driver;

    //TC #8: Selecting value from multiple select dropdown
    //1. Open Chrome browser
    @BeforeMethod

    public void navigateToChrome(){
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
        public void navigateToCyde()  {
        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");


        //3. Select all the options from multiple select dropdown.
        Select selectMultipleOptions = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        selectMultipleOptions.selectByVisibleText("JavaScript");
            selectMultipleOptions.selectByValue("java");

            selectMultipleOptions.selectByVisibleText("Ruby");
            selectMultipleOptions.selectByIndex(4);
            selectMultipleOptions.selectByValue("c");
            selectMultipleOptions.selectByValue("c#");


        //4. Print out all selected values.
        //5. Deselect all values.

            selectMultipleOptions.deselectByIndex(0);
            selectMultipleOptions.deselectByValue("js");
            selectMultipleOptions.deselectByVisibleText("C#");
            selectMultipleOptions.deselectByValue("python");
            selectMultipleOptions.deselectByIndex(4);
            selectMultipleOptions.deselectByVisibleText("C");

    }

@AfterMethod
    public void tearDownMethod(){
        driver.close();
}


}
