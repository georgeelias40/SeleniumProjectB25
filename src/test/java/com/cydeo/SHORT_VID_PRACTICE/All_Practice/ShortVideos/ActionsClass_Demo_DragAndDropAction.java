package com.cydeo.SHORT_VID_PRACTICE.All_Practice.ShortVideos;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class ActionsClass_Demo_DragAndDropAction {
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //2. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @Test
    public void testDragAndDrop() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement smallCircle = driver.findElement(By.id("draggable"));
        WebElement bigCircle = driver.findElement(By.id("droptarget"));

        System.out.println("bigCircle.getText() = " + bigCircle.getText());

        Actions actions = new Actions(driver);
      //  actions.dragAndDrop(smallCircle,bigCircle).perform();
        actions.moveToElement(smallCircle).pause(1000)
             .clickAndHold().pause(1000)
             .moveToElement(bigCircle).pause(1000)
             .release()
             .perform();

        System.out.println("bigCircle.getText() = " + bigCircle.getText());

        assertEquals("You did great!",bigCircle.getText());
      //  Thread.sleep(3000);
    }



























}
