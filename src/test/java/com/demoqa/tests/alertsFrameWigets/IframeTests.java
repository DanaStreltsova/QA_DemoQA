package com.demoqa.tests.alertsFrameWigets;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.alertsFrameWindows.FramePage;
import com.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframeTests extends TestBase {

    @BeforeMethod
   public void precondition(){
        new HomePage(driver).getAlertsFrameWindows();
    }

    @Test
    public void iframeTest() {
        new SidePanel(driver).selectFrame();
        new FramePage(driver).returnListOfFrames()
        .switchToIframeByIndex(1)
        .verifyIframeByText("This is a sample page");
    }

    @Test
    public void iframeTest2(){
        new SidePanel(driver).selectFrame();
        new FramePage(driver).switchToIframeById()
                .verifyIframeByText("sample page")
                .switchToMainPage()
                .verifyMainPageByTitle("Frames");
    }

    @Test
    public void nestedIframesTest(){
        new SidePanel(driver).selectNestedFrames();
        new FramePage(driver).handleNestedIframes();
    }
}


