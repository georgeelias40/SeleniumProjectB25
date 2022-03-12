package com.cydeo.SHORT_VID_PRACTICE.All_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_test_in_browser {
    public static void main(String[] args) {
        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //navigate to "https://search.yahoo.com"
        driver.navigate().to("https://search.yahoo.com");

        //use css selector to identify search box and enter "css Selector"


        //couple way to search them on "inspector"
        /**
         * // #yschsp
         * //input#yschsp or input[id='yschsp']
         * input[name='p']
         * input[name='p'][class='sbq'] or input.sbq[name='p']
         * div>input[name='p']
         * div#sbq-wrap>input[name='p']
         * #sbq-wrap>#yschsp
         */

        WebElement searchBox = driver.findElement(By.cssSelector("#yschsp"));
        searchBox.sendKeys("css selector");




        // click on x icon to clear out the text
        /**
         * button#sbq-clear > span
         * button#sbq-clear > span.sprite or div#sbq-clear > span[class='sprite']
         * button[id='sbq-clear'] > span.sprite
         * button[type='button'][class='sbq-x']>span
         */

        WebElement clearIcon = driver.findElement(By.cssSelector("button#sbq-clear > span.sprite"));



        //enter "selenium locators" into search box
        searchBox.sendKeys(" selenium locators");
        //identify search icon and click on it

        /**
         * span[title='Search']
         * button>span[title='Search']
         * button.sbb>span[title='Search']  or  button[class='sbb']>span[title='Search']
         * span[title='Search'][class='ico-syc mag-glass']
         * span.ico.syc.mag.glass[title='Search']
         */

        WebElement searchIcon = driver.findElement(By.cssSelector("span.ico.syc.mag.glass[title='Search']"));
        searchBox.click();


    }
}
