package com.cydeo.tests.day02_02_12_2022;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC06 {
    public static void main(String[] args) {
        // TC:6 As a user I should be able to see the password as "*******"

        //1-open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2-goto https://vytrack.com/
        driver.get("https://vytrack.com/");
        //3-click Login label
        //cssLocator for login :#top-menu>li#menu-item-849>a
        //xpath locator for login : //ul[@id='top-menu']/li[6]/a
        driver.findElement(By.xpath("//ul[@id='top-menu']/li[6]/a")).click();
        //4-enter username "User1"
        WebElement userNameWebElement = driver.findElement(By.id("prependedInput"));
        userNameWebElement.sendKeys("User1");
        //5-enter password "UserUser123"
        WebElement passwordWebElement = driver.findElement(By.name("_password"));
        passwordWebElement.sendKeys("UserUser123");

        //6-verify the password is hidden
        String type = passwordWebElement.getAttribute("type");

        if (type.equals("password")){
            System.out.println("PASSED");
        }else{
            System.err.println("FAILED");
        }
        driver.close();
    }
}