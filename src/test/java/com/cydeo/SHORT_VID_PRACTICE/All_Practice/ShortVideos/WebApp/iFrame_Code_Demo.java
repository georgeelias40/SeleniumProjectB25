package com.cydeo.SHORT_VID_PRACTICE.All_Practice.ShortVideos.WebApp;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class iFrame_Code_Demo {
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //2. Go to http://practice.cybertekschool.com/javascript_alerts
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }



    @Test
    public void test_iFrame(){
    driver.get("http://practice.cybertekschool.com/iframe");

    //switch to the iframe using index
        //driver.switch().frame(0);
        //switch to the iframe using id or name
        //driver.switchTo().frame("mce_0_ifr");
        //switch to the iframe using WebElement
            WebElement iFrameElm = driver.findElement(By.cssSelector("iframe[title^='Rich Text Area']"));
            driver.switchTo().frame(iFrameElm);
        // identify the <p> element inside the iframe
        WebElement pTagElmInsideFrame = driver.findElement(By.tagName("p"));
        System.out.println("pTagElmInsideFrame.getText() = " + pTagElmInsideFrame.getText());


        // switch out of the frame
     //   driver.switchTo().defaultContent();//this will switch to top level html

        driver.switchTo().parentFrame(); // this will switch back ip one level inside nested html document.



        // click on home button to go back to main practice page

        driver.findElement(By.linkText("Home")).click();

    }





















}