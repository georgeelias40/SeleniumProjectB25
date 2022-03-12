package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: https://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }




    @Test
    public void alert_test1() throws InterruptedException {
        //3. Click to “Click for JS Alert” button
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));


        informationAlertButton.click();

        //To be able to click to Alert OK button we need to switch driver's focus to Alert itself.
        Alert alert = driver.switchTo().alert();

        //4. Click to OK button from the alert
        /**
         * inspect inspectors right when you try to right click on this, nothing is happening because
         * this is not part of the html code, this is outside  this html code that we have here, it is not generating
         * something in here, somehow, this is just maybe some kind of browser
         * functionality that javascript is generating this box over here because we have this attribute and value okay.
         * And we just the only way to click to this OK button is using the except method this alert that except method.
         * And once we click to the accept the alert disappears from the page and our driver can refocus to the html after this.
         */
           alert.accept();

                    //5. Verify “You successfully clicked an alert” text is displayed.
                    WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

                    //Failure message will only be displayed if assertion fails: "Result text is NOT displayed."
                    Assert.assertTrue(resultText.isDisplayed(),"Result text is NOT displayed.");


                    String expectedText = "You successfully clicked an alert";
                    String actualText = resultText.getText();

                    Assert.assertEquals(actualText,expectedText,"Actual result text is not as expected");
                    }


    }

