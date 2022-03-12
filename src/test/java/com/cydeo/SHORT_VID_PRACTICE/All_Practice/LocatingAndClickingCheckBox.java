package com.cydeo.SHORT_VID_PRACTICE.All_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAndClickingCheckBox {
    /**
     * Type ="checkbox"
     * Checkboxes allow users to select (and unselect) one or more options in answer to a question.
     *
     * "Name"
     * The name attribute is sent to the server with value of the option(s) the user selects.
     *
     * "Value"
     * The value attribute indicates the value sent to the server if this checkbox is checked.
     *
     * "Checked"
     * The checked attribute indicates that this box should be checked where the page loads.
     * if used, its value should be checked.
     */
    public static void main(String[] args) throws InterruptedException {


        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        //navigate to "http://practice.cybertekschool.com/checkboxes"
        driver.get("http://practice.cybertekschool.com/checkboxes");

        //Identify the elements from id
        WebElement checkBox1 = driver.findElement(By.id("box1"));
        System.out.println("Before click checkBox1.isSelected() = " + checkBox1.isSelected());//isSelected is a boolean
        Thread.sleep(3000);
        checkBox1.click();

        System.out.println("After click checkBox1.isSelected() = " + checkBox1.isSelected());


        // Identify the second element from id
        WebElement checkBox2 = driver.findElement(By.id("box2"));
        System.out.println("Before click checkBox2.getAttribute(\"Checked\") = "
                + checkBox2.getAttribute("Checked"));

        checkBox2.click(); //this will uncheck it because it was checked
        System.out.println("After click checkBox2.getAttribute(\"Checked\") = "
                + checkBox2.getAttribute("Checked"));

        // If we want to check the checkbox
        if (! checkBox1.isSelected()){
            checkBox1.click();
        }else{
            System.out.println("CheckBox 1 is already Selected");
        }

        driver.close();
    }


}
