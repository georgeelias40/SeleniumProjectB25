package com.cydeo.tests.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.DocFlavor;


public class TC04 {
    private static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

       //- Go to "https://app.vytrack.com/user/login"

        forEachVerification("https://app.vytrack.com/user/login");



        //- Verify the url contains "vytrack"
        verifyingURL("vytrack");





        //- Verify the title contains "Login"
            verifyingTitleContains("Login");

        //- Verify the label "Login"
        verifyingLabel("Login");


        //login
        Thread.sleep(3000);
        login("abcd","abcd");

        //- Verify the message "Invalid user name or password"
                verifyingMessage("Invalid user name or password.");








        Thread.sleep(5000);

            driver.close();











    }

    private static void verifyingMessage(String expectedMessage) {
        WebElement messageElement = driver.findElement(By.className("alert"));
            String actualMessage = messageElement.getText();
        System.out.println(actualMessage.equals(expectedMessage)?"Label Passed":"Label Failed");

    }




    private static void login(String userName, String passWord) {

        WebElement userNameWebElement = driver.findElement(By.name("_username"));
        userNameWebElement.sendKeys(userName);

        WebElement passWordWebElement = driver.findElement(By.id("prependedInput2"));
        passWordWebElement.sendKeys(passWord);
        //click login button
        driver.findElement(By.id("_submit")).click();
    }






    private static void verifyingLabel(String expectedLabelText) {
        WebElement labelElement = driver.findElement(By.tagName("h2"));
        String actualLabelText = labelElement.getText();
        System.out.println(actualLabelText.equals(expectedLabelText)?"Label Passed":"Label Failed");
    }







    private static void verifyingTitleContains(String expectedWord) {
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle.contains(expectedWord)?"Title Passed":"Title Failed");

    }








    private static void verifyingURL(String expectedWord) {


        String actualURL =  driver.getCurrentUrl();
        System.out.println(actualURL.contains(expectedWord)?"Url Passed":"Url Failed");
    }







    private static void forEachVerification(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

}
