package com.demoqa.tests.elements;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.elements.TextBoxPage;
import com.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TextBoxTest extends TestBase {
    @BeforeMethod
    public void preconditions(){
        new HomePage(driver).getElements();
        new SidePanel(driver).selectTextBox();
    }

    @Test
    @Parameters({"name","email","address"})
    public void keyBoardEventTest(String name,String email,String address){
        new TextBoxPage(driver).enterData(name,email)
                .keyBoardEvent(address)
                .submit()
                .verifyCopyPastText();
    }
}
