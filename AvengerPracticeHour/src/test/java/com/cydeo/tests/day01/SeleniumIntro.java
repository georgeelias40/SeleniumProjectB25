package com.cydeo.tests.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {
    public static void main(String[] args) throws InterruptedException {

        // 1- Setup the "browser driver"
        WebDriverManager.chromedriver().setup();

        // 2- Create instance of the Selenium WebDriver, this is the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        // 3- Maximize the browser size
        driver.manage().window().maximize();

        // 4- Go to "https://www.selenium.dev"
        driver.get("https://www.selenium.dev");

        // 5- Get the title of the page

        driver.getTitle();


        // 6- Get the URL of the page
        driver.getCurrentUrl();

        // 7- Use selenium to navigate back
            driver.navigate().back();

        // 8- Use selenium to navigate forward
        driver.navigate().forward();

        // 9- Use selenium to navigate refresh
        driver.navigate().refresh();

        // 10- Use navigate().to() "https://www.etsy.com":
            driver.get("https://www.etsy.com");

        // 11- Close the currently opened window
            driver.close();

        // 12- Close all of the opened windows

            driver.quit();












    }
}
