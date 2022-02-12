package com.cydeo.tests.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC02 {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        //Setup the "browser driver"

        //Go to "https://www.selenium.dev"


        forEachVerification("https://www.selenium.dev/");


        //Verify the title contains "Selenium"
        verifyingTitleContains("Selenium");


        Thread.sleep(3000);
        driver.close();
    }

    private static void verifyingTitleContains(String expectedTitle) {
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle.contains(expectedTitle)?"Title Passed":"Title Failed");
    }





    private static void forEachVerification(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

    }
}
