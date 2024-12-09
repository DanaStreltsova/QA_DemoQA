package com.demoqa.tests.bookStore;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.bookStore.LoginPage;
import com.demoqa.pages.bookStore.ProfilePage;
import com.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getBookStore();
        new SidePanel(driver).selectLogin();
    }

    @Test
    public void LoginPositiveTest(){
        new LoginPage(driver)
                .enterUserData("Veselaya","Veselaya123$")
                .clickOnLoginButton();
        new ProfilePage(driver).verifyUserName("Veselaya");
    }
}
