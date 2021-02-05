package com.trycloud.tests.Halim;

import com.trycloud.tests.base.TestBase;
import com.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UserStory03_TC007 extends TestBase {

    @Test
    public void uploadFileInsideFileTest(){

        WebElement folder = driver.findElement(By.xpath("(//tbody)[1]/tr[2]/td[2]/a"));
        folder.click();

        BrowserUtils.sleep(1);

        WebElement addButton = driver.findElement(By.xpath("//a[@class='button new']"));
        addButton.click();

        BrowserUtils.sleep(1);

        WebElement uploadFileButton = driver.findElement(By.xpath("//label[@for='file_upload_start']"));
        uploadFileButton.sendKeys("C:\\Users\\HP\\Desktop\\Capture.PNG");

        uploadFileButton.click();

    }
}
