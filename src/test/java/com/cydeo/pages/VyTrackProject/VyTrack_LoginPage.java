package com.cydeo.pages.VyTrackProject;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrack_LoginPage {



        public VyTrack_LoginPage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }

        //enter a username
        @FindBy(xpath = "//input[@id='prependedInput']")
        public WebElement usernameInput;

        //enter a password
        @FindBy(xpath = "//input[@id='prependedInput2']")
        public WebElement passwordInput;

        @FindBy(xpath = "//button[@id='_submit']")
        public WebElement loginButton;



    }

