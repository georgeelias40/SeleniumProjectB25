package com.cydeo.tests.day02_02_12_2022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC07 {
    public static void main(String[] args) throws InterruptedException {
        // TC:7 As a user I should be able to see User is John Doe

        //1-open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //2-goto https://vytrack.com/
        driver.get("https://vytrack.com/");
        //3-click Login label
        WebElement loginElement = driver.findElement(By.linkText("LOGIN"));
        Thread.sleep(3000);
        loginElement.click();
        //4-enter username "User1"
        WebElement userNameWebElement = driver.findElement(By.id("prependedInput"));
        userNameWebElement.sendKeys("User1");
        Thread.sleep(3000);
        //5-enter password "UserUser123"
        WebElement passwordWebElement = driver.findElement(By.name("_password"));
        passwordWebElement.sendKeys("UserUser123");
        Thread.sleep(3000);
        //6-click LOG IN
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(6000);
        //7-verify the user John Doe
        WebElement userWebElement = driver.findElement(By.xpath("//a[@href='javascript: void(0);']"));
        String userName = userWebElement.getText();
        if (userName.equals("John Doe")){
            System.out.println("PASSED");
        }else{
            System.err.println("FAILED");
        }
        driver.close();
    }
}