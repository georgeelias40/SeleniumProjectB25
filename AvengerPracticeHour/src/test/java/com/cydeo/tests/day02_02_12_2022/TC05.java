package com.cydeo.tests.day02_02_12_2022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TC05 {
    public static void main(String[] args) {
        // TC:5 As a user I should be able to see the login page

        //1-open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2-goto https://vytrack.com/
        driver.get("https://vytrack.com/");
        //3-click Login label
        WebElement loginWebElement = driver.findElement(By.xpath("//ul[@id='top-menu']//a[.='LOGIN']"));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        loginWebElement.click();
        //4-verify the url contains login
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("login")){
            System.out.println("PASSED");
        }else{
            System.err.println("FAILED");
        }
        driver.close();
        //break till 12:10 AM
    }
}