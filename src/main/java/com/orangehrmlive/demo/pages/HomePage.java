package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilites.Utilities;
import org.openqa.selenium.By;

public class HomePage extends Utilities {
    By logo=By.xpath("//img[@alt=\"OrangeHRM\"]");
    By profileLogo=By.xpath("//a[@id=\"welcome\"]");
    By logout=By.xpath("//a[text()='Logout']");
public void clickOnProfileLogo(){
    clickOnElement(profileLogo);
}
public void clickOnLogoutLink(){
    clickOnElement(logout);
}
    public void verifyLogoIsDisplay(){
        boolean isDisplay=driver.findElement(logo).isDisplayed();
        if(isDisplay)
            System.out.println("Logo is Displayed on page");

    }




}
