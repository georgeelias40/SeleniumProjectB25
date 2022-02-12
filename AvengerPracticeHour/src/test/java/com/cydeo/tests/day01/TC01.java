package com.cydeo.tests.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01 {
    public static void main(String[] args) throws InterruptedException {

        //Setup the "browser driver"
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Go to "https://www.selenium.dev/"
        driver.get("https://www.selenium.dev");


        //Verify the URL

        String expectedURL = "https://www.selenium.dev/";
        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL.equals(expectedURL)?"Passed":"Failed");


        Thread.sleep(5000);

        driver.close();



    }

    }

