package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldLoginSuccessfully() {
        loginPage.userShouldLoginSuccessfully();
        loginPage.verifyWelcomeText();
    }

    @Test
    public void verifyThatTheLoginDisplayOnHomePage() {
        loginPage.userShouldLoginSuccessfully();
        homePage.verifyLogoIsDisplay();
    }

    @Test
    public void verifyUserShouldLogOutSuccessfully() {

        loginPage.userShouldLoginSuccessfully();
        homePage.clickOnProfileLogo();
        homePage.clickOnLogoutLink();
        loginPage.verifyLoginPanel();


    }
}

