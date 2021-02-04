package com.trycloud.tests.UserStory03;

import com.trycloud.tests.base.TestBase;
import com.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory03_TC008 extends TestBase {

    @Test
    public void deleteFileTest(){

        WebElement actionButton = driver.findElement(By.xpath("//a[@href='/remote.php/webdav/00%20-%20Interview%20Prep%20editted%20by%20Albert.pdf']/span[2]/a[2]"));
        actionButton.click();

        BrowserUtils.sleep(1);

        WebElement deleteButton = driver.findElement(By.xpath("//a[@class='menuitem action action-delete permanent']"));
        deleteButton.click();

        BrowserUtils.sleep(1);

        WebElement trashBin = driver.findElement(By.xpath("//a[.='Deleted files']"));
        trashBin.click();

        BrowserUtils.sleep(1);

        Assert.assertTrue(driver.findElement(By.xpath("//span[.='00 - Interview Prep editted by Albert']")).isDisplayed());

    }

    @Test
    public void addCommentTest(){

        WebElement actionButton = driver.findElement(By.xpath("//a[@href='/index.php/apps/files?dir=//group5_1']/span[3]/a[2]"));
        actionButton.click();

        BrowserUtils.sleep(1);

        WebElement detailsButton = driver.findElement(By.xpath("//a[@class='menuitem action action-details permanent']"));
        detailsButton.click();

        BrowserUtils.sleep(1);

        WebElement commentButton = driver.findElement(By.xpath("//li[@data-tabid='commentsTabView']"));
        commentButton.click();

        BrowserUtils.sleep(1);

        WebElement commentInputBox = driver.findElement(By.xpath("//div[@class='message']"));
        commentInputBox.sendKeys("Great Job Group 5" + Keys.ENTER);

        BrowserUtils.sleep(1);

        WebElement commentMessage = driver.findElement(By.xpath("//div[.='Great Job Group 5']"));
        Assert.assertTrue(commentMessage.isDisplayed());


    }
}
