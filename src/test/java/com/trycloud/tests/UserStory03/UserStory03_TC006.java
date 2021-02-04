package com.trycloud.tests.UserStory03;

import com.trycloud.tests.base.TestBase;
import com.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class UserStory03_TC006 extends TestBase {

    @Test
    public void createFolderTest(){

        WebElement addButton = driver.findElement(By.xpath("//a[@class='button new']"));
        addButton.click();

        BrowserUtils.sleep(1);

        WebElement addFolder = driver.findElement(By.xpath("//a[@data-templatename=\"New folder\"]"));
        addFolder.click();

        BrowserUtils.sleep(1);

        WebElement folderNameInputBox = driver.findElement(By.id("view29-input-folder"));
        folderNameInputBox.sendKeys("Test Folder" + Keys.ENTER);

        BrowserUtils.sleep(1);

        WebElement newFolder = driver.findElement(By.xpath("(//tbody[@id='fileList'])[1]/tr[2]/td[2]/a"));
        System.out.println(newFolder.getText());

       Assert.assertTrue(newFolder.isDisplayed());





    }
}
