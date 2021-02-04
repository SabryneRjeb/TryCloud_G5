package com.trycloud.tests.Mini;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory03_TC008_1 extends TestBase {

    //3. Story: As a user, I should be able to access to Files module.
    //Test case #8 - verify users can delete a file/folder.
    //1. Login as a user

    @Test
    public void test(){
        //2. Click action-icon from any file on the page

        WebElement actionIcon=driver.findElement(By.xpath("(//span[@class='icon icon-more'])[3]"));
        actionIcon.click();

        //3. Choose “delete files” option
        WebElement deleteButton= driver.findElement(By.xpath("(//span[.='Delete'])[2]"));
        deleteButton.click();

        //4. Click deleted files on the left bottom corner
        WebElement deletedFilesButton= driver.findElement(By.xpath("//a[.='Deleted files']"));
        deletedFilesButton.click();

        //5. Verify the deleted file is displayed on the page.
        //(Pre-condition: there should be at least 1 file is uploaded inside files page)
        WebElement deletedFile= driver.findElement(By.xpath("(//span[.='group5'])[2]"));
        Assert.assertTrue(deletedFile.isDisplayed());
        //for the next time keep trying restored the button
        WebElement restore= driver.findElement(By.xpath("//span[.=' Restore']"));
        restore.click();
    }



}
