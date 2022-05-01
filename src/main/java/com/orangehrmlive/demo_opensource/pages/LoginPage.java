package com.orangehrmlive.demo_opensource.pages;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userName1=By.id("txtUsername");
    By password1=By.id("txtPassword");
    By loginButton=By.name("Submit");
    By welcomeText=By.id("welcome");

    public void enterUserName(String userName){
        sendTextToElement(userName1,userName);
    }
    public void enterPassword(String password){
        sendTextToElement(password1,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }

}
