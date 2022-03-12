package com.cydeo.SHORT_VID_PRACTICE.All_Practice.ShortVideos;

import com.cydeo.utilities.WebDriverFactory;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebElements {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //2. Go to http://practice.cybertekschool.com/javascript_alerts
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @Test
    public void testWebTable() {
        driver.get("http://practice.cybertekschool.com/tables");

        WebElement cell42 = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[4]/td[2]"));
        Assert.assertTrue(cell42.isDisplayed());
        System.out.println("cell42.getText = " + cell42.getText());



        WebElement cellTim = driver.findElement(By.xpath("//table[@id='table1']//td[text()='Tim']"));
        Assert.assertTrue(cellTim.isDisplayed());
        System.out.println("cell42.getText = " + cellTim.getText());



        // print out all the cell values of row 4
        ////table[@id='table1']/tbody/tr[4]/td

        String row4CellLocator = "//table[@id='table1']/tbody/tr[4]/td";
        List<WebElement> allRow4Cells = driver.findElements(By.xpath(row4CellLocator));

        //this will print names of all thr rows
        for (WebElement eachCell : allRow4Cells) {
            System.out.println("eachCell.getText() = " + eachCell.getText());
        }




    }























}