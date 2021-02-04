package com.trycloud.tests.Hoshang;

import com.google.common.base.Verify;
import com.trycloud.tests.base.TestBase;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UserStory3_TC05 extends TestBase {

    @Test
    public void fileUploading() {

//        Test case #5 - verify users can upload a file directly to the homepage (File-Uploading)
//        1. Login as a user
//        2. Click the “+” icon on top
//        3. Click “upload file”
//        4. Upload a file
//        5. Verify the file is displayed on the page

        WebElement plusIcon = driver.findElement(By.xpath("//a[@class='button new']"));
        plusIcon.click();

        String filePath = "C:\\Users\\hosha\\Desktop\\What is JKD,JRE and JVM.txt";

        WebElement uploadFile = driver.findElement(By.xpath("//label[@class='menuitem']"));
        uploadFile.sendKeys(filePath);
        uploadFile.click();






    }

}
