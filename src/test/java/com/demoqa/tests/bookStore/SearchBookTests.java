package com.demoqa.tests.bookStore;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.bookStore.ProfilePage;
import com.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchBookTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getBookStore();
    }

    @Test
    public void searchBookPositiveTest(){
        new ProfilePage(driver).tyKeyInSearchInput("git")
                .verifyNameOfBook("Git");
    }
}
