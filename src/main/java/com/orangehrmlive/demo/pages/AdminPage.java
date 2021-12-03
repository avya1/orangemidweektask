package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilites.Utilities;
import org.openqa.selenium.By;

public class AdminPage extends Utilities {

    By checkBox=By.xpath("//input[@id=\"ohrmList_chkSelectAll\"]");
    By deleteButton=By.xpath("//input[@id=\"btnDelete\"]");
    By popUpOkButton=By.xpath("//input[@id=\"dialogDeleteBtn\"]");
    //Successfully Deleted ka nai mil raha hai


    public void tickOnCheckBox(){
        clickOnElement(checkBox);
    }
    public void clickOnDeleteButton(){
        clickOnElement(deleteButton);
    }
    public void clickOnOkButtonPopup(){
        clickOnElement(popUpOkButton);
    }

}



