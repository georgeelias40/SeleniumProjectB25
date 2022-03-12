package com.cydeo.SHORT_VID_PRACTICE.All_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CssSelector_Challenge_Solution_Part2_in_Code {
    public static void main(String[] args) throws InterruptedException {

        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //navigate to "http://practice.cybertekschool.com/registration-form"
        driver.navigate().to("http://practice.cybertekschool.com/registration_form");


        // locate elements using css selector
        /**
         * input[name='firstname']
         * input[placeholder='first name']
         * input[data-bv-field='firstname']
         * form#registationForm input[name='firstname']
         * input[name='firstname'][class='form-control']
         * input.form-control[name='firstname']
         */

        WebElement firstnameField = driver.findElement(By.cssSelector("input[name='firstname']"));
        Thread.sleep(2000);
        firstnameField.sendKeys("Adam");

        /**
         * input[name='lastname']
         * input[placeholder='last name']
         * input[date-bv-field='lastname']
         * form#registrationForm input[name='lastname']
         *
         */
        WebElement lastnameField = driver.findElement(By.cssSelector("input[name='lastname']"));
        Thread.sleep(2000);
        lastnameField.sendKeys("Jones");


        /**
         * input[name='username']
         * input[placeholder='user name']
         * input[data-bv-field='username']
         * form#registrationForm input[name='username']
         */
          WebElement usernameField = driver.findElement(By.cssSelector("input[name='username']"));
           Thread.sleep(2000);
          usernameField.sendKeys("adamtheman");

        /**
         * input[name='email']
         * input[placeholder='email@email.com']
         * input[databv-field='email']
         * form#registrationForm input[name='email']
          */
        WebElement emailField = driver.findElement(By.cssSelector("input[name='email']"));
        Thread.sleep(2000);
        emailField.sendKeys("someone@somewhere.com");


        /**
         * input[name='password']
         * input[data=bv=field='password']
         * input[name='password'][type='password']
         */

        WebElement passwordField = driver.findElement(By.cssSelector("input[name='password'][type='password']"));
        Thread.sleep(2000);
        passwordField.sendKeys("topsecret");


        /**
         *  input[name='phone']
         *  input[data=bv=field='phone']
         *  input[name='phone'][type='tel']
         */
        WebElement phoneField = driver.findElement(By.cssSelector("input[name='phone'][type='tel']"));
        Thread.sleep(2000);
        phoneField.sendKeys("911-911-9111");


        /**
         * input[name='gender'][value='male']
         * input[type='radio'][name='gender'][value='male']
         */

        WebElement genderRadioBtn = driver.findElement(By.cssSelector("input[name='gender'][value='male']"));
        Thread.sleep(2000);
        genderRadioBtn.click();


        /**
         * input[name='birthday']
         * input[data-bv-field='birthday']
         * input[name='birthday'][placeholder='MM/DD/YYYY']
         */

        WebElement birthdayField = driver.findElement(By.cssSelector("input[name='birthday']"));
        Thread.sleep(2000);
        birthdayField.sendKeys("01/01/2000");


        /**
         * select[name='department']
         * select[name='department'][class='form-control selectpicker']
         * select.selectpicker[name='department']
         */

        WebElement depDropDownElm = driver.findElement(By.cssSelector("select[name='department']"));
        //this is drop down list and we need this class called "Select"
        Select depSelectObj = new Select(depDropDownElm);
        Thread.sleep(2000);
        depSelectObj.selectByIndex(2);


        /**
         * select[name='job_title']
         * select[name='job_title'][class='form-control selectpicker']
         * select.selectpicker[name='job_title']
         */

        WebElement titleDropDownElm = driver.findElement(By.cssSelector("select.selectpicker[name='job_title']"));
        Select titleSelectObj = new Select(titleDropDownElm);
        Thread.sleep(2000);
        titleSelectObj.selectByIndex(5);


        /**
         * #inlineCheckbox1
         * input#inlineCheckbox1
         * input[type='checkbox'][value='cplusplus']
         */


        WebElement checkBox1 = driver.findElement(By.cssSelector("#inlineCheckbox1"));
        Thread.sleep(2000);
        checkBox1.click();


        /**
         * #wooden_spoon
         * button.btn.btn-primary
         * button[class='btn btn-primary']
         * button.btn.btn-primary[type='submit']
         */

        WebElement signButton = driver.findElement(By.cssSelector("#wooden_spoon"));
        Thread.sleep(2000);
        signButton.click();

        Thread.sleep(5000);
        driver.close();



    }
}
