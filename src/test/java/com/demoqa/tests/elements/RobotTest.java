package com.demoqa.tests.elements;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.elements.UploadFilePage;
import com.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RobotTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getElements();
        new SidePanel(driver).selectUploadFile();
    }

    @Test
    public void performKeyEventWithRobotTest(){
        new UploadFilePage(driver).performKeyEventWithRobot()
                .verifyPath("C:\\fakepath\\D1.txt")
        ;
    }

    @Test
    public void performMauseEventWithRobotTest(){
        new UploadFilePage(driver).performMouseEvent();
    }
}
