package com.cydeo.tests.day02_02_12_2022;


import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC02 {
    public static void main(String[] args) {
        // TC:2 As a user I should be able to see About is displayed

        //1-open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2-goto https://vytrack.com/
        driver.navigate().to("https://vytrack.com/");
        //3-verify About us is displayed
        WebElement aboutUsWebElement = driver.findElement(By.xpath("//ul[@id='top-menu']/li[@id='menu-item-854']/a"));
        System.out.println("aboutUsWebElement.getText() = " + aboutUsWebElement.getText());
        if (aboutUsWebElement.isDisplayed()){
            System.out.println("PASSED");
        }else {
            System.err.println("FAILED");
        }
    }
}