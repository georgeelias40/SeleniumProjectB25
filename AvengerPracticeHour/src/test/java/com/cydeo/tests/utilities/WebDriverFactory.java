package com.cydeo.tests.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



// TASK: NEW METHOD CREATION
// Method name : getDriver
// Static method
// Accepts String arg: browserType
//   - This arg will determine what type of browser is opened
//   - if "chrome" passed --> it will open chrome browser
//   - if "firefox" passed --> it will open firefox browser
// RETURN TYPE: "WebDriver"


public class WebDriverFactory {
    // TASK: NEW METHOD CREATION
// Method name : getDriver
// Static method
// Accepts String arg: browserType
    public static WebDriver getDriver(String browserType){


        //   - if "chrome" passed --> it will open Chrome browser
        if (browserType.equalsIgnoreCase("chrome")) {


            // RETURN TYPE: "WebDriver"
            WebDriverManager.chromedriver().setup();
            //WebDriver driver = new ChromeDriver  ==> it will complicate everything
            //use the ==> return new ChromeDriver
            return new ChromeDriver();




//   - if "firefox" passed --> it will open firefox browser
// RETURN TYPE: "WebDriver"

    } else if (browserType.equalsIgnoreCase("firefox")) {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();


    } else {
            System.out.println("Given browser type does not exist/or is not currently supported");
            System.out.println("Driver = null");
            return null;
    }

}}
