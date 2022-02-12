package com.cydeo.tests.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TCC03 {


    /*
    TC03
    //Setup the "browser driver"

            //Go to "https://www.google.com"

            //Verify the title contains "Google"

            //Navigate to "https://www.etsy.com"

            //Verify not in google page

            //Verify the title  contains "Etsy"
     */

        private static WebDriver driver;

        public static void main(String[] args) {

            forEachVerification("https://www.google.com");

            verifyingTitleContains("Google");

            navigateTo("https://www.etsy.com");

            verifyingNotAtPeriviousPage("Google");

            verifyingTitleContains("Etsy");

            driver.close();


        }

        private static void verifyingNotAtPeriviousPage(String periviousTitle) {
            String currentTitle = driver.getTitle();
            if (!(currentTitle.contains(periviousTitle))) {
                System.out.println("Not in the GOOGLE page! verifying PASSED!");
            } else {
                System.out.println("verifying FAILED!");
            }
        }

        private static void navigateTo(String newUrl) {
            driver.navigate().to(newUrl);
        }

        private static void verifyingTitleContains(String expectedWord) {
            String actualTitle = driver.getTitle();

            if (actualTitle.contains(expectedWord)) {
                System.out.println("Title verification PASSED!");
            } else {
                System.out.println("Title varification FAILED!");
            }
        }

        private static void forEachVerification(String url) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(url);
        }
    }

