package com.trycloud.tests.Halim;

import com.trycloud.tests.base.TestBase;
import com.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class UserStory03_TC004 extends TestBase {

    @Test
    public void removeFromFavoritesTest() {

        WebElement favoritesPage = driver.findElement(By.xpath("//a[@class='nav-icon-favorites svg']"));
        favoritesPage.click();

        BrowserUtils.sleep(1);

        WebElement actionMenu = driver.findElement(By.xpath("(//a[@class='action action-menu permanent'])[3]"));
        actionMenu.click();

        BrowserUtils.sleep(1);

        WebElement removeFromFavorites = driver.findElement(By.xpath("//a[@class='menuitem action action-favorite permanent']"));
        removeFromFavorites.click();

        BrowserUtils.sleep(1);

        List<WebElement> fileList = driver.findElements(By.xpath("(//tbody[@id='fileList'])[3]"));
        Assert.assertTrue(!fileList.contains(driver.findElement(By.xpath("(//a[@href='/index.php/apps/files?dir=//group5_1'])[2]"))));


    }
}