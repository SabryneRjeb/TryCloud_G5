package com.trycloud.tests.UserStory03;

import com.trycloud.tests.base.TestBase;
import com.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.*;

public class UserStory03_TC005 extends TestBase {

    @Test
    public void uploadFileTest(){

        WebElement addButton = driver.findElement(By.xpath("//a[@class='button new']"));
        addButton.click();

        BrowserUtils.sleep(1);

       // String path = "C:\\Users\\HP\\Desktop\\Capture.PNG";

       WebElement uploadFileButton = driver.findElement(By.xpath("//label[@for='file_upload_start']"));
       // BrowserUtils.sleep(2);
        uploadFileButton.click();
        BrowserUtils.sleep(2);
        uploadFileButton.sendKeys("C:\\Users\\HP\\Desktop\\Capture.PNG");




    }
}
