package com.trycloud.tests.UserStory03;

import com.trycloud.tests.base.TestBase;
import com.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Stack;

public class UserStory03_TC004 extends TestBase {
    @Test
    public void addFileToFavoritesTest(){

        WebElement actionMenu = driver.findElement(By.xpath("//tr[@data-file='group5_1']/td[2]/a/span/a[2]"));
        actionMenu.click();

        BrowserUtils.sleep(1);

        WebElement addToFavorites = driver.findElement(By.xpath("//a[@class='menuitem action action-favorite permanent']"));
        addToFavorites.click();

        BrowserUtils.sleep(1);

        WebElement favoritesPage = driver.findElement(By.xpath("//a[@class='nav-icon-favorites svg']"));
        favoritesPage.click();

        BrowserUtils.sleep(1);

        WebElement addedFile = driver.findElement(By.xpath("(//tbody)[3]/tr/td/a[@href='/index.php/apps/files?dir=//group5_1']"));
        Assert.assertTrue(addedFile.isDisplayed());

    }
    @Test
    public void removeFromFavoritesTest() {

        WebElement favoritesPage = driver.findElement(By.xpath("//a[@class='nav-icon-favorites svg']"));
        favoritesPage.click();

        BrowserUtils.sleep(1);

        WebElement actionMenu = driver.findElement(By.xpath("(//tbody[@id='fileList'])[3]/tr[@data-file='group5_1']/td[1]/a/span[3]/a[2]"));
        actionMenu.click();

        BrowserUtils.sleep(1);

        WebElement removeFromFavorites = driver.findElement(By.xpath("//a[@class='menuitem action action-favorite permanent']"));
        removeFromFavorites.click();

        BrowserUtils.sleep(1);

        List<WebElement> fileList =  driver.findElements(By.xpath("(//tbody[@id='fileList'])[3]"));
        Assert.assertTrue(!fileList.contains(driver.findElement(By.xpath("(//tbody[@id='fileList'])[3]/tr[@data-file='group5_1']"))));

        //(//a[@href='/index.php/apps/files?dir=//group5_1'])[2]
    }
}