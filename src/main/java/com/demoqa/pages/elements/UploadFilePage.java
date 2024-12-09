package com.demoqa.pages.elements;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;

public class UploadFilePage extends BasePage {
    public UploadFilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "uploadFile")
    WebElement uploadFile;
    public UploadFilePage performKeyEventWithRobot() {
        pause(1000);
        moveWithJS(0,200);
        clickRectangle(uploadFile,3,4);

        Robot robot;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        robot.keyPress(KeyEvent.VK_SHIFT);
        pause(1000);
        robot.keyPress(KeyEvent.VK_D);

        robot.keyRelease(KeyEvent.VK_SHIFT);

        robot.keyPress(KeyEvent.VK_1);
        robot.keyPress(KeyEvent.VK_PERIOD);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_X);
        robot.keyPress(KeyEvent.VK_T);

        robot.keyPress(KeyEvent.VK_ENTER);


        return this;
    }

    @FindBy(id = "uploadedFilePath")
    WebElement uploadedFilePath;
    public UploadFilePage verifyPath(String path) {
        Assert.assertTrue(shouldHaveText(uploadedFilePath,path,5));

        return this;
    }

    public UploadFilePage performMouseEvent() {

        pause(1000);
        moveWithJS(0,200);
        clickRectangle(uploadFile,3,4);

        Robot robot;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        Dimension dimension = driver.manage().window().getSize();
        System.out.println("Dimension x and y " + dimension.getWidth() + "***" + dimension.getHeight());

        return this;
    }
}
