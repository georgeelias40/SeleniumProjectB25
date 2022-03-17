package com.cydeo.SHORT_VID_PRACTICE.All_Practice.ShortVideos;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertTrue;

public class ActionsClass_Demo_RightClick_DoubleClickActions  {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //2. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void testRightClick() throws InterruptedException{
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_oncontextmenu");

        // locate the div element inside iframe
        // with css selector and right click on it
        driver.switchTo().frame("iframeResult") ;
        WebElement area = driver.findElement(By.cssSelector("div[contextmenu='mymenu']")) ;

        // right click -> context click
        Actions actions = new Actions(driver);
        actions.contextClick(area).perform();

        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        Thread.sleep(1000);
    }
    @Test
    public void testDoubleClick() throws InterruptedException{

        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
        driver.switchTo().frame("iframeResult");
        // Double-click this paragraph to trigger a function.
        WebElement pElm = driver.findElement(By.xpath("//p[.='Double-click this paragraph to trigger a function.']"));
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.doubleClick(pElm).perform();
        // assert new p element with Hello World text displayed
        WebElement resultElm = driver.findElement(By.xpath("//p[.='Hello World']")) ;
        assertTrue(resultElm.isDisplayed() );
        Thread.sleep(2000);
    }

}
