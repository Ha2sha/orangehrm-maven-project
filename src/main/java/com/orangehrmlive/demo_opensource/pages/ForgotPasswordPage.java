package com.orangehrmlive.demo_opensource.pages;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends Utility {
    By forgotPasswordLink = By.linkText("Forgot your password?");
    By getMessage=By.tagName("h1");

    public void clickOnForgotPasswordLink(){
        clickOnElement(forgotPasswordLink);
    }
    public String getMessage(){
        return getTextFromElement(getMessage);
    }

}
