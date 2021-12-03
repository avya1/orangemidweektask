package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilites.Utilities;
import org.openqa.selenium.By;

public class AddUserPage extends Utilities {

  By admin=By.xpath("//a[@id=\"menu_admin_viewAdminModule\"]");
  By systemUser=By.xpath("//div[@class=\"head\"]");
    By addButton=By.xpath("//input[@name=\"btnAdd\"]");
    By addUserText=By.xpath("//h1[@id=\"UserHeading\"]");
    By userRol=By.xpath("//select[@id=\"systemUser_userType\"]");//value 1,text Admin
    By employeeName=By.id("systemUser_employeeName_empName");// Ananya Dash
    By username=By.id("systemUser_userName");
    By status=By.id("systemUser_status");//value 0,text Disabled
    By password=By.xpath("//input[@id=\"systemUser_password\"]");
    By confirmPassword=By.xpath("//input[@id=\"systemUser_confirmPassword\"]");
    By save=By.xpath("//input[@id=\"btnSave\"]");


    public void clickOnAdminTab(){clickOnElement(admin);}
    public void verifySystemUser(){
        String exp="System Users";
        verifyPage(exp,systemUser);
    }
    public void clickOnAddButton(){clickOnElement(addButton);}
    public void verifyAddUserText(){
        String exp="Add User";
        verifyPage(exp,addUserText);}
    public void selectUserRoll(){
        selectFromDropDown(userRol,"1");
    }
    public void enterEmployeeName(){sendTextElement(employeeName,"Ananya Dash");}
    public void enterUserName(){
        sendTextElement(username,"Rajeev");
    }
    public void selectStatusFromDropDown(){
        selectFromDropDown(status,"0");
    }
    public void enterPassword(){
        sendTextElement(password,"rajeev123456");
    }
    public void enterConfirmPassword(){
        sendTextElement(confirmPassword,"rajeev123456");
    }
    public void clickOnSaveButton(){
        clickOnElement(save);
    }




}
