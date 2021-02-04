package com.trycloud.tests.karim.userStory03;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase04 extends testCase03 {
    // #4 - verify users can remove a file from favorites.
    // 1.Login as a user

    @Test

    public void testCase04() throws Exception {


// 2.Click action-icon from any file on the page
        WebElement actionIcon = driver.findElement(By.xpath("//span[@class='icon icon-more']"));
        Thread.sleep(2000);
        actionIcon.click();

// 3.Click “Remove from Favorites” option
        WebElement removeFavorite = driver.findElement(By.xpath("//span[text()='Remove from favorites']"));
        Thread.sleep(2000);
        removeFavorite.click();

// 4.Verify that the file is removed from Favorites sub-module’s table.

        Assert.assertTrue(removeFavorite.isDisplayed());
// (Pre-condition: there should be at least 1 file is added to favorites table)

         }
    }