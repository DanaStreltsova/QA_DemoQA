package com.demoqa.tests.interaction;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.interactions.DroppablePage;
import com.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragDropTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getInteractions();
        new SidePanel(driver).selectDroppable().hideIframes();
    }

    @Test
    public void actionDragMeTast(){
        new DroppablePage(driver).actionDragMe()
                .verifyDropped("Dropped!");
    }

    @Test
    public void dragAndDropByTest(){
        new DroppablePage(driver).dragAndDropBy(20,20)
                .verifyDropped("Dropped!");
    }
}
