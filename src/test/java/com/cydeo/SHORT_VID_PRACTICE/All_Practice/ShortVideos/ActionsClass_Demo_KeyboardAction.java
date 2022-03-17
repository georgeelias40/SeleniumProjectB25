package com.cydeo.SHORT_VID_PRACTICE.All_Practice.ShortVideos;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ActionsClass_Demo_KeyboardAction {
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //2. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void testKeyboardAction() throws InterruptedException {
        driver.get("https://google.com");
        WebElement searchBox = driver.findElement(By.name("q"));

        // click on the element
        // hold down to the shift and enter text
        // release to the shift and enter text
        // hod down to Command on Mac, Control on Windows, enter A to select all
        // send keys backspace
        // pause 1 seconds in between actions

        Actions actions = new Actions(driver);
        actions.click(searchBox).pause(1000)
                .keyDown(Keys.SHIFT)
                .sendKeys("typing by holding down to shift").pause(1000)
                .keyUp(Keys.SHIFT)
                .sendKeys("typing after releasing shift").pause(1000)
                .keyDown(Keys.CONTROL).sendKeys("A") // Mac
        // .keyDown(Keys.CONTROL).sendKeys("A") // Windows
                .keyUp(Keys.CONTROL)  // .keyUp(Keys.CONTROL)/ for Windows
                .sendKeys(Keys.BACK_SPACE)
                .perform();

        Thread.sleep(3000);








    }





}
