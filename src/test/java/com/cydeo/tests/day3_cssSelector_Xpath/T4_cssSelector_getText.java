package com.cydeo.tests.day3_cssSelector_Xpath;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {
    public static void main(String[] args) {

        /**
         TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
         1- Open a chrome browser
         2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
         3- Verify “Reset password” button text is as expected:
         Expected: Reset password



         PS: Inspect and decide which locator you should be using to locate web
         elements.
         PS2: Pay attention to where to get the text of this button from */






        //TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Verify “Reset password” button text is as expected:
        //Expected: Reset password
        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[class='login-btn']"));

        String expectedButtonText = "Reset password";

        String actualResetButton = resetPasswordButton.getText();

        System.out.println(actualResetButton.equals(expectedButtonText)? "Reset button verification PASSED" : "Reset button verification FAILED");

        driver.close();
    }
}
