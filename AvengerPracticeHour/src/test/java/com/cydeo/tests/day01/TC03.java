package com.cydeo.tests.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC03 {


    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        //Setup the "browser driver"

        //Go to "https://www.google.com"
        forEachVerification("https://www.google.com");


        //Verify the title contains "Google"
        verifyingTitleContainsGoogle("Google");

        Thread.sleep(3000);



        //Navigate to "https://www.etsy.com"
        navigateToEtsy("https://www.etsy.com");




        //Verify not in google page
        verifyingNotInGooglePage("Google");




        //Verify the title  contains "Etsy"
        verifyingTitleContainsEtsy("Etsy");

        Thread.sleep(3000);
        driver.close();
    }

    private static void verifyingTitleContainsGoogle(String expectedTitleGoogle) {
        String actualTitle = driver.getTitle();
        System.out.println(expectedTitleGoogle.contains(actualTitle) ? "Google Title Passed" : "Title Failed");

    }

    private static void verifyingNotInGooglePage(String expectedURL) {
        expectedURL = "Google";
        String actualURL = driver.getCurrentUrl();
        System.out.println(expectedURL.equals(actualURL)?"URL Passed":"URL Failed");


    }


    private static void navigateToEtsy(String expectedToEtsy) {
        driver.navigate().to(expectedToEtsy);
        System.out.println("Navigation Passed !");


    }


    private static void forEachVerification(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }




    private static void verifyingTitleContainsEtsy(String expectedTitleEtsy) {
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle.contains(expectedTitleEtsy) ? "Etsy Title Passed !" : "Title Failed");

    }






}





