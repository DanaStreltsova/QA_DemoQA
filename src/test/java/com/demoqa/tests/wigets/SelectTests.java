package com.demoqa.tests.wigets;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.widgets.SelectMenuPage;
import com.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getWidgets();
        new SidePanel(driver).getSelectMenu().hideIframes();
    }

    @Test
    public void selectOldStyleTest(){
        new SelectMenuPage(driver).selectOldStyle("Blue")
                .verifyColor();
    }

    @Test
    public void multiSelectTast(){
        new SelectMenuPage(driver).multiSelect(new String[]{"Red","Green"});
    }

    @Test
    public void standardMultiSelectTest(){
        new SelectMenuPage(driver).standardMultiSelect(new String[]{"Volvo","Audi"});
    }
}
