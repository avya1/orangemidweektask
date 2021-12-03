package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilites.Utilities;
import org.openqa.selenium.By;

public class DashboardPage extends Utilities {

  By userName=By.xpath("//input[@id=\"searchSystemUser_userName\"]");
    By userRol=By.id("searchSystemUser_userType");//value 1,text Admin
    By employeeName=By.className("ac_input");
    By status=By.xpath("//select[@id=\"searchSystemUser_status\"]");//value 0,text Disabled
    By search=By.xpath("//input[@id=\"searchBtn\"]");
    By verifyResultList=By.xpath("//td[text()='Ananya Dash']");
    public void verifyResultLst(){
        String exp="Ananya Dash";
        verifyPage(exp,verifyResultList);
    };

    public void enterUserName() {
        sendTextElement(userName, "Rajeev");

    }
    public void selectUserRole(){
        selectFromDropDown(userRol,"1");
        //selectByVisibleTextFromDropDown(userRol,"Admin");
    }
    public void enterEmployeeName(){
        sendTextElement(employeeName,"Ananya Dash");
    }
    public void selectStatus(){
        selectFromDropDown(status,"0");
    }
    public void clickOnSearchButton(){
        clickOnElement(search);
    }
    }
