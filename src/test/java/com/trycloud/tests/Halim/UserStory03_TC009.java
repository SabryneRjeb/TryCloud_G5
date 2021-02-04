package com.trycloud.tests.Halim;

import com.trycloud.tests.base.TestBase;
import com.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory03_TC009 extends TestBase {

    @Test
    public void changeAppSettingsTest(){

        WebElement settingsButton = driver.findElement(By.xpath("//button[@class='settings-button']"));
        settingsButton.click();

        BrowserUtils.sleep(1);

        WebElement showHiddenFiles = driver.findElement(By.xpath("//label[@for='showhiddenfilesToggle']"));
       showHiddenFiles.click();

       BrowserUtils.sleep(1);

       if (showHiddenFiles.isEnabled()){
           Assert.assertTrue(showHiddenFiles.isEnabled());
       }else{
           Assert.assertTrue(!showHiddenFiles.isDisplayed());
       }

    }

}
