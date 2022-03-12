package com.cydeo.SHORT_VID_PRACTICE.x_pATH;


import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Login {
    public WebDriver driver;

    @BeforeMethod
    public void openSesame() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void loginConfirmation(){
        driver.get("https://login2.nextbasecrm.com/");
        WebElement enterUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        enterUsername.sendKeys("hr54@cydeo.com");

        WebElement enterPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        enterPassword.sendKeys("UserUser");

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String actualTitle = driver.getTitle();
        String expectedTitle = "(7) Portal";
        System.out.println(driver.getTitle());

        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match expected");
        WebElement taskTabButton = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-tasks']"));
        taskTabButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement enterTitleTextHere = driver.findElement(By.xpath("//input[@name='ACTION[0][ARGUMENTS][data][TITLE]']"));
        enterTitleTextHere.click();
        enterTitleTextHere.sendKeys("Title Content");




        WebElement frame = driver.findElement(By.xpath("(//iframe[@class=\"bx-editor-iframe\"])[2]"));
        driver.switchTo().frame(frame);
        WebElement enterBodyMessage = driver.findElement(By.xpath("//body[@style='min-height: 84px;']"));

        enterBodyMessage.click();
        enterBodyMessage.sendKeys("Entering body message");



    }


}


