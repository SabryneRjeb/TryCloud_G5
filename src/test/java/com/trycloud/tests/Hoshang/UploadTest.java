package com.trycloud.tests.Hoshang;

import com.utilities.BrowserUtils;
import com.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadTest {

    @Test
    public void uploadTest() {

//        TC #14: Upload Test
//        1. Go to http://practice.cybertekschool.com/upload
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");

//        2. Find some small file from your computer, and get the path of it.
        String filePath = "C:/Users/hosha/Downloads/Screen Shot 2021-01-26 at 3.20.18 PM.png";

        WebElement chooseFile = Driver.getDriver().findElement(By.id("file-upload"));

        BrowserUtils.sleep(2);
        chooseFile.sendKeys(filePath);

//        3. Upload the file.
        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();

//        4. Assert:
//        -File uploaded text is displayed on the page

        WebElement fileUploadedText = Driver.getDriver().findElement(By.xpath("//h3[.='File Uploaded!']"));

        String expected = "File Uploaded!";
        String actual = fileUploadedText.getText();

        Assert.assertTrue(fileUploadedText.isDisplayed(), "Failed it is not displayed");

        Assert.assertEquals(actual, expected, "Failed, file not uploaded");

        Driver.closeDriver();
    }

}
