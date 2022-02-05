package com.cydeo.tests.day2_Locators_getText_getAttribute.HomeWork;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zero_Bank_Header_Verification {

    public static void main(String[] args) throws InterruptedException {

        // TC #2: Zero Bank header verification
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //how to maximize our window

        driver.manage().window().maximize();

        //  2. Go to http://zero.webappsecurity.com/login.html

        driver.get("http://zero.webappsecurity.com/login.html");


        //  3. Verify header text

        WebElement headerText = driver.findElement(By.className("page-header"));
        //  Expected: “Log in to ZeroBank”

        String actualHeaderText = headerText.getText();
        String expectedHeaderText = "Log in to ZeroBank";


        if (actualHeaderText.equals(expectedHeaderText)) {
            System.out.println("Header text verification PASSED!");
        } else {
            System.out.println("Header text verification FAILED!!!");


        }
        Thread.sleep(5000);
        driver.close();
    }
}