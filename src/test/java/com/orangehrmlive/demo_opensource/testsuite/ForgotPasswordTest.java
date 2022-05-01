package com.orangehrmlive.demo_opensource.testsuite;

import com.orangehrmlive.demo_opensource.pages.ForgotPasswordPage;
import com.orangehrmlive.demo_opensource.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends TestBase {
    ForgotPasswordPage forgotPasswordPage=new ForgotPasswordPage();
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        forgotPasswordPage.clickOnForgotPasswordLink();
        String expectedText="Forgot Your Password?";
        String actualText=forgotPasswordPage.getMessage();
        Assert.assertEquals("Link is Broken",expectedText,actualText);
    }
}
