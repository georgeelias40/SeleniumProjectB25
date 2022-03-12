package com.cydeo.tests.day5_testNG_intro_dropdowns.HomeWork;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T6_Dropdown_Verifying {
    WebDriver driver;

    //TC #6: Selecting date on dropdown and verifying
    //1. Open Chrome browser
    @BeforeMethod

    public void navigateToChrome(){
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }




        @Test


        public void navigateToCydeo(){
            //2. Go to https://practice.cydeo.com/dropdown
            driver.get("https://practice.cydeo.com/dropdown");
        }




        //3. Select “December 1st, 1923” and verify it is selected.

        public void verifyingDateSelection() {

            Select selectSpecificYear = new Select(driver.findElement(By.xpath("//select[@id='year']")));
            //Select year using  : visible text
           selectSpecificYear.selectByVisibleText("1923");



            Select selectSpecificMonth = new Select(driver.findElement(By.xpath("//select[@id='month']")));
            //Select month using   : value attribute
            selectSpecificMonth.selectByValue("11");



            Select selectSpecificDay = new Select(driver.findElement(By.xpath("//select[@id='day']")));
            //Select day using : index number
            selectSpecificDay.selectByIndex(0);



            //true or false
            System.out.println("selectSpecificYear.getFirstSelectedOption().isSelected() = "
                    + selectSpecificYear.getFirstSelectedOption().isSelected());

            System.out.println("selectSpecificMonth.getFirstSelectedOption().isSelected() = "
                    + selectSpecificMonth.getFirstSelectedOption().isSelected());

            System.out.println("selectSpecificDay.getFirstSelectedOption().isSelected() = "
                    + selectSpecificDay.getFirstSelectedOption().isSelected());

        }
        @AfterMethod
        public void tearDownMethod(){
        driver.close();
        }



}
