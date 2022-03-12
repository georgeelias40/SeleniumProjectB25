package com.cydeo.SHORT_VID_PRACTICE.All_Practice.ShortVideos;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class File_Upload {
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //2. Go to http://practice.cybertekschool.com/upload
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void testFileUpload(){
        driver.get("http://practice.cybertekschool.com/upload");
       String filePath = "C:/Users/georg/OneDrive/Pictures/TheCoolPic.jpg";
      driver.findElement(By.id("file-upload")).sendKeys(filePath);

      driver.findElement(By.id("file-submit")).click();

        System.out.println("END");
    }

}
