package com.demoqa.tests.forms;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.forms.PracticeFormPage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.utils.DataProviders;
import com.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticeFormTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getForms();
        new SidePanel(driver).selectPracticeForm().hideIframes();
    }

    @Test(dataProviderClass = DataProviders.class,dataProvider ="addNewStudentWithCsv")
    public void createStudentAccount(String name,String lastName,String email,String phone){
         new PracticeFormPage(driver)
                .enterPersonalData(name,lastName,email,phone)
                .selectGender("Male")
                .enterDate("22 jun 1989")
                .addSubject(new String[]{"Math", "Chemistry"})
                .selectHobby(new String[]{"Sports", "Reading"})
                .uploadFile("C:/Users/strel/Downloads/мару1.jpg")
                .inputState("NCR")
                .inputCity("Delhi")
                .submit()
                .verifySuccessRegistration("Thanks for submitting the form");
        ;
    }


    @Test
    public void createStudentAccountWithSelectDate(){
         new PracticeFormPage(driver)
                .enterPersonalData("Marina", "Weide", "marinaweide@gm.com", "1546982093")
                .selectGender("Male")
                .selectDate("August","1989","22")
                .addSubject(new String[]{"Math", "Chemistry"})
                .selectHobby(new String[]{"Sports", "Reading"})
                .uploadFile("C:/Users/strel/Downloads/мару1.jpg")
                .inputState("NCR")
                .inputCity("Delhi")
                .submit()
                .verifySuccessRegistration("Thanks for submitting the form");
        ;
    }


}
