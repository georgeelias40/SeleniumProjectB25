package com.cydeo.SHORT_VID_PRACTICE.All_Practice.ShortVideos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form_Challenge_XPath_in_code {

    public static void main(String[] args) throws InterruptedException {

        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //navigate to "http://practice.cybertekschool.com/registration-form"
        driver.navigate().to("http://practice.cybertekschool.com/registration_form");



        //locate elements using xpath and sign up and verify success message
        /**
         * //div/h2[.='Registration form']
         *          * //div/h2[text()='Registration form']
         *          * //div[]@class='page-header']/h2[text()='Registration form']
         */
        WebElement header = driver.findElement(By.xpath("//div/h2[.='Registration form']"));
        System.out.println("header.isDisplayed() = " + header.isDisplayed());





        /**
         * //form//input[@name='firstname']
         *          * //form[@id='registrationForm']//input[@name='firstname']
         *          * //input[@name='firstname']
         *          * //input[@data-bv-field='firstname']
         */


        WebElement firstnameField = driver.findElement(By.xpath("//input[@name='firstname']"));
        Thread.sleep(2000);
        firstnameField.sendKeys("Adam");

        /**
         *  //input[@name='lastname']
         */
        WebElement lastnameField = driver.findElement(By.xpath("//input[@name='lastname']"));
        Thread.sleep(2000);
        lastnameField.sendKeys("Jones");





        /**
         * //input[@name='username']
         */
        WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']"));
        Thread.sleep(2000);
        usernameField.sendKeys("adamtheman");







        /**
         * //input[@data-bv-field='email']
         */
        WebElement emailField = driver.findElement(By.xpath("//input[@data-bv-field='email']"));
        Thread.sleep(2000);
        emailField.sendKeys("someone@somewhere.com");






        /**
         * //input[@data-bv-field='password']
         */

        WebElement passwordField = driver.findElement(By.xpath("//input[@data-bv-field='password']"));
        Thread.sleep(2000);
        passwordField.sendKeys("topsecret");






        /**
         *  //input[@name='phone']

         */
        WebElement phoneField = driver.findElement(By.xpath("//input[@name='phone']"));
        Thread.sleep(2000);
        phoneField.sendKeys("911-911-9111");








        /**
         *  //input[@type='radio' and @value='female']

         */

        WebElement femaleRadioBtn = driver.findElement(By.xpath("//input[@type='radio' and @value='female']"));
        Thread.sleep(2000);
        femaleRadioBtn.click();






        /**
         * //input[@name='birthday']

         */

        WebElement birthdayField = driver.findElement(By.xpath("//input[@name='birthday']"));
        Thread.sleep(2000);
        birthdayField.sendKeys("01/01/2000");






        /**
         *  //select[@name='department']

         */

        WebElement depDropDownElm = driver.findElement(By.xpath("//select[@name='department']"));
        //this is drop down list and we need this class called "Select"
        Select depSelectObj = new Select(depDropDownElm);
        Thread.sleep(2000);
        depSelectObj.selectByIndex(2);








        /**
         *
         *  //select[@name='job_title']

         */

        WebElement titleDropDownElm = driver.findElement(By.xpath("//select[@name='job_title']"));
        Select titleSelectObj = new Select(titleDropDownElm);
        Thread.sleep(2000);
        titleSelectObj.selectByIndex(5);






        /**
         *
         *  //input[@type='checkbox' and @value='java']

         */


        WebElement checkBox1 = driver.findElement(By.xpath("//input[@type='checkbox' and @value='java']"));
        Thread.sleep(2000);
        checkBox1.click();






        /**
         *  //button[@type='submit' and @id='wooden_spoon']
         */

        WebElement signButton = driver.findElement(By.xpath("//button[@type='submit' and @id='wooden_spoon']"));
        Thread.sleep(2000);
        signButton.click();

        Thread.sleep(5000);
        driver.close();








        /**
         *
         *
         *
         *
         *
         * //form//input[@name='firstname']
         * //form[@id='registrationForm']//input[@name='firstname']
         * //input[@name='firstname']
         * //input[@data-bv-field='firstname']
         *
         *
         *
         * //input[@name='lastname']
         *
         *
         *
         *
         *
         *
         * //input[@name='username']
         *
         *
         *
         *
         *
         *
         * //input[@data-bv-field='email']
         *
         *
         *
         *
         *
         * //input[@data-bv-field='password']
         *
         *
         *
         * //input[@name='phone']
         *
         *
         *
         * //input[@type='radio' and @value='female']
         *
         *
         *
         * //input[@name='birthday']
         *
         *
         *
         *
         * //select[@name='department']
         *
         *
         *
         *
         *
         * //select[@name='job_title']
         *
         *
         *
         *
         *
         * //input[@type='checkbox' and @value='java']
         *
         *
         *
         *
         *
         *
         * //button[@type='submit' and @id='wooden_spoon']
         * //*[@*='wooden-spoon']
         */


























































































    }
    }
