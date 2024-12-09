package com.demoqa.tests.alertsFrameWigets;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.alertsFrameWindows.BrowserWindows;
import com.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewWindowTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getAlertsFrameWindows();
        new SidePanel(driver).selectBrowserWindows().hideIframes();
    }

    @Test
    public void newTabTest(){
        new BrowserWindows(driver).swittchToNewTab(1)
                .verifyNewTabTitle("This is a sample page");
    }

}
