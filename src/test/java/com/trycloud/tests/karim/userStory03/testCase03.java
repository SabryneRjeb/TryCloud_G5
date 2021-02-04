package com.trycloud.tests.karim.userStory03;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase03 extends TestBase {
    //1.Login as a user

    @Test

    public void testCase03() throws InterruptedException {

        // 2.Click action-icon from any file on the page

        WebElement iconButton = driver.findElement(By.xpath("(//span[@class='icon icon-more'])[3]"));
        Thread.sleep(2000);
        iconButton.click();

        // 3.Choose “Add to Favorites” option

        WebElement favoritesIcon = driver.findElement(By.xpath("//a[@class='menuitem action action-favorite permanent']"));
        Thread.sleep(2000);
        favoritesIcon.click();

        // 4.Click “Favorites” sub-module on the lest side

        WebElement favoriteSubModule = driver.findElement(By.xpath("//a[@class='nav-icon-favorites svg']"));
        Thread.sleep(2000);
        favoriteSubModule.click();

        // 5.Verify the chosen file is listed on the table (Pre-condition: there should be at least 1 file is uploaded

        WebElement favoriteImage = driver.findElement(By.xpath("//table[@class='list-container']//tbody//tr[1]"));
        Thread.sleep(2000);


        Assert.assertTrue(favoriteImage.isDisplayed());

    }


    }