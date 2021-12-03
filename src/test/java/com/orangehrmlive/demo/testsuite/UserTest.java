package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class UserTest extends TestBase {
    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();
    AddUserPage addUserPage=new AddUserPage();
    DashboardPage dashboardPage=new DashboardPage();
   AdminPage adminPage=new AdminPage();
   ViewSystemUserPage viewSystemUserPage=new ViewSystemUserPage();

    @Test
    public void adminShouldAddUserSuccessFully() throws InterruptedException {
        loginPage.userShouldLoginSuccessfully();
        addUserPage.clickOnAdminTab();
        addUserPage.verifySystemUser();
        addUserPage.clickOnAddButton();
        addUserPage.verifyAddUserText();
        addUserPage.selectUserRoll();
        addUserPage.enterEmployeeName();
        addUserPage.enterUserName();
        addUserPage.selectStatusFromDropDown();
        addUserPage.enterPassword();
        addUserPage.enterConfirmPassword();
        addUserPage.clickOnSaveButton();
        Thread.sleep(3000);
        //verify baki hai last line



    }
    @Test
    public void searchTheUserCreatedAndVerifyIt() {
       // adminShouldAddUserSuccessFully();
        loginPage.userShouldLoginSuccessfully();
        addUserPage.clickOnAdminTab();
        addUserPage.verifySystemUser();
        dashboardPage.enterUserName();
        dashboardPage.selectUserRole();
        dashboardPage.enterEmployeeName();
        dashboardPage.selectStatus();
        dashboardPage.clickOnSearchButton();
        dashboardPage.verifyResultLst();

    }
    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessfully() throws InterruptedException {
        searchTheUserCreatedAndVerifyIt();
        adminPage.tickOnCheckBox();
        adminPage.clickOnDeleteButton();
        adminPage.clickOnOkButtonPopup();
        //verify baki hai last line
    }
    @Test
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound(){
        loginPage.userShouldLoginSuccessfully();
        addUserPage.clickOnAdminTab();
        addUserPage.verifySystemUser();
        dashboardPage.enterUserName();
        dashboardPage.selectUserRole();
        dashboardPage.enterEmployeeName();
        dashboardPage.selectStatus();
        dashboardPage.clickOnSearchButton();
        viewSystemUserPage.verifyUserRecordDeleted();

    }


}
