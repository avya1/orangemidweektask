package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilites.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage extends Utilities {
    By userName=By.xpath("//input[@id='txtUsername']");
    By password=By.xpath("//input[@id='txtPassword']");
    By loginButton=By.id("btnLogin");
    By loginPanel=By.xpath("//div[text()='LOGIN Panel']");
    By welcome=By.xpath("//a[@id=\"welcome\"]");


    public void userShouldLoginSuccessfully(){
        enterUserName();
        enterPassword();
        clickOnLoginButtonOnHomePage();
    }
public void enterUserName(){
    sendTextElement(userName,"Admin");
}
public void enterPassword(){
    sendTextElement(password,"admin123");
}
public void clickOnLoginButtonOnHomePage(){
    clickOnElement(loginButton);
}
public void verifyWelcomeText(){
        String exp="Welcome Paul";
        verifyPage(exp,welcome);
   /* String exp="Welcome";
    WebElement message = driver.findElement(welcome);
    String actualResult = message.getText();
    if (actualResult.contains("Welcome")){
        exp = actualResult;
        Assert.assertEquals(exp,message);
    }

    */

}
public void verifyLoginPanel(){
    String exp="LOGIN Panel";
    verifyPage(exp,loginPanel);
}

}
