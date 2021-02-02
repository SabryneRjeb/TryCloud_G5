package com.trycloud.tests.Sabryne;

import com.google.common.base.Verify;
import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class User3_TC_8 extends TestBase {
//Test case #8 - verify users can delete a file/folder.
//1. Login as a user
//2. Click action-icon from any file on the page
//3. Choose “delete files” option
//4. Click deleted files on the left bottom corner
//5. Verify the deleted file is displayed no the page.

    @Test

    public void deleteFileFolder() throws InterruptedException {


        WebElement locatingTheG5Folder = driver.findElement(By.xpath("(//span[@class='nametext'])/span[.='group5']"));

        WebElement iconButton =driver.findElement(By.xpath("(//a[@class='action action-menu permanent'])[4]"));
        Thread.sleep(2000);
        iconButton.click();


        WebElement deleteOption = driver.findElement(By.xpath("//a[@data-action='Delete']"));
        Thread.sleep(1000);
        deleteOption.click();

        WebElement deletedFilesButton = driver.findElement(By.xpath("//li[@data-='trashbin']"));
        Thread.sleep(1000);
        deletedFilesButton.click();


        Assert.assertTrue(locatingTheG5Folder.isDisplayed(),"Failed!!!");





    }



}
