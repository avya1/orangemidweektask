package com.orangehrmlive.demo.testbase;

import com.orangehrmlive.demo.propertyreader.PropertyReader;
import com.orangehrmlive.demo.utilites.Utilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utilities {
    String browser= PropertyReader.getInstance().getProperty("browser");
    @BeforeMethod
    public void setUp()
    {
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown()
    {
        closeBrowser();
    }
}
