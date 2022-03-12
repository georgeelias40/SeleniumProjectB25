package com.cydeo.SHORT_VID_PRACTICE.All_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Element_By_TagName {
    public static void main(String[] args) throws InterruptedException {
        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        //navigate to "http://practice.cybertekschool.com/"
        driver.get("http://practice.cybertekschool.com/");


        // identify and save the first element with <a> tag
        WebElement firsLink = driver.findElement(By.tagName("a")); // by using tagName

        // print out the text
        //this will give us the text of one element
        System.out.println("firsLink.getText() = " + firsLink.getText());


        //identify and sava all the element with <a> tag

        // findElements method will return List<WebElement>
        // using the (ArrayList) "List" to find all the element matching the criteria
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("allLinks.size() = " + allLinks.size()); //to find how many links in that webSite


        // Iterate over this list and get the text of all the link WebElement
            //by using "for each loop" to get us the list of all links
        for (WebElement eachLink : allLinks) {
            System.out.println("Link text is " + eachLink.getText());
        }



        // click on the Home link
        firsLink.click();
        Thread.sleep(5000);

        driver.close();

    }
}
