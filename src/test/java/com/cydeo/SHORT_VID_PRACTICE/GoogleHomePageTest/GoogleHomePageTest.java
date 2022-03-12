package com.cydeo.SHORT_VID_PRACTICE.GoogleHomePageTest;

import com.cydeo.utilities.WebDriverFactory;
import jdk.swing.interop.SwingInterOpUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleHomePageTest {
    WebDriver driver;


    @BeforeMethod
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void testHomePage() throws InterruptedException{
        driver.get("https://google.com");
        Thread.sleep(2000);

    //assert the title is Google
    Assert.assertEquals(driver.getTitle(),"Google");
    Thread.sleep(2000);


    }



    @Test
    public void testSearch() throws InterruptedException {

        driver.get("https://google.com");
        Thread.sleep(2000);

        driver.findElement(By.name("q")).sendKeys("Selenium"+ Keys.ENTER);
        Thread.sleep(2000);


    }

        // creat a data provide method for Google search multiple items
        //verify the expected title according to what we search
        @DataProvider (name = "searchData")
        public Object [][] provideSearchData(){
        return new Object[][]{
                {"selenium","selenium - Google Search"},
                {"java","java - Google Search"},
                {"job","job - Google Search"}
        };

        }

        @Test(dataProvider =   "searchData")
        public void searchDataDriven(String keyword,String expectedTitle) throws InterruptedException {
            System.out.println("Search " + keyword + " expect title is " + expectedTitle );

            driver.get("https://google.com");
            Thread.sleep(2000);

            driver.findElement(By.name("q")).sendKeys(keyword+ Keys.ENTER);
            Thread.sleep(2000);


            Assert.assertEquals(driver.getTitle(), expectedTitle);
            Thread.sleep(1000);


        }

    @AfterMethod

    public void tearDown(){

        driver.close();
    }

















}
