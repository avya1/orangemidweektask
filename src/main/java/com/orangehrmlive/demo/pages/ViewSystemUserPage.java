package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilites.Utilities;
import org.openqa.selenium.By;

public class ViewSystemUserPage extends Utilities {
 /*   By systemUserText=;
    By text=;
    By userNameField=;
    By userRollDropDown=;
    By employeeNameField=;
    By statusDropDown=;
    By searchButton=;
    By resetButton=;
    By addButton=;
    By deleteButton=;

  */


   // By noRecordFound=By.xpath("td[text()=\"No Records Found\"]");
    By noRecordFound=By.xpath("//td[@colspan='5']");
    public void verifyUserRecordDeleted(){
        String exp="No Records Found";
        verifyPage(exp,noRecordFound);
    }




}
