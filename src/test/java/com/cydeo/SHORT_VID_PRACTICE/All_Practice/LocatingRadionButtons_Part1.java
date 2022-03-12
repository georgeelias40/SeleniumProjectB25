package com.cydeo.SHORT_VID_PRACTICE.All_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatingRadionButtons_Part1 {
    /**
     * Type="radio"
     * Radio buttons allow users to pick just one of a number of options
     * <p>
     * "name"
     * The name attribute is sent to the server with the value of the option the user selects.
     * <p>
     * "value"
     * The value attribute determines the value that is sent to the server for the selected option.
     * The value of each of the buttons in a group should be different
     * <p>
     * "checked"
     * the checked attribute can be used to indicate which value should be selected when the page loads.
     * the value of this attribute is checked.
     */
    public static void main (String [] args){

        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //navigate to "http://practice.cybertekschool.com/radio_buttons"
        driver.navigate().to("http://practice.cybertekschool.com/radio_buttons");



        // Identify the element by using id
        WebElement blueRadioBtn = driver.findElement(By.id("blue"));
        //check if its  already selected or not
        System.out.println("blueRadioBtn.isSelected() = " + blueRadioBtn.isSelected());
        blueRadioBtn.click();


        WebElement redRadioBtn = driver.findElement(By.id("red"));
        //check if its already selected or not
        System.out.println("Before click redRadioBtn.isSelected() = " + redRadioBtn.isSelected());

        redRadioBtn.click();

        System.out.println("After click redRadioBtn.isSelected() = " + redRadioBtn.isSelected());
        //check blue radio button not selected
        System.out.println("After Selecting red blueRadioBtn.isSelected() = " + blueRadioBtn.isSelected());


        // Identify Green radio button

        WebElement greenRadioBtn = driver.findElement(By.id("green"));
        greenRadioBtn.click();
        System.out.println("greenRadioBtn.isSelected() = "
                + greenRadioBtn.isSelected());

        System.out.println("greenRadioBtn.isEnabled() = "
                + greenRadioBtn.isEnabled());

            // iden
        List<WebElement> allColorRadios = driver.findElements(By.name("color"));
        System.out.println("allColorRadios.size() = " + allColorRadios.size());


        for (WebElement eachRadioBtn : allColorRadios){
            System.out.println("current radio button is(\"id\") = " + eachRadioBtn.getAttribute("id"));
            System.out.println("is it Enabled() = " + eachRadioBtn.isEnabled());
            System.out.println("is it ?.isSelected() = " + eachRadioBtn.isSelected());

        }
    }


}
