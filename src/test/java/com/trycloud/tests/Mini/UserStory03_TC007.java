package com.trycloud.tests.Mini;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory03_TC007 extends TestBase {

    //Test case #7 - verify users can upload a file inside a folder
    // 1.Login as a user

    @Test
    public void test(){
        // 2.Choose a folder from the page
        WebElement folder= driver.findElement(By.xpath("(//span[.='group5_1'])[2]"));
        folder.click();
        // 3.Click the “+” icon on top

        WebElement plusButton= driver.findElement(By.xpath("//span[@class='icon icon-add']"));
        plusButton.click();

        // 4.Click “upload file”
        String path="C:\\Users\\HP\\Desktop\\Capture.PNG";

        WebElement uploadFile= driver.findElement(By.xpath("//span[.='Upload file']"));
        uploadFile.sendKeys(path);

        //  uploadFile.click();

        uploadFile.click();





        // 5.Upload a file


        // 6.Verify the file is displayed on the page
        // (Pre-condition: there should be at least 1 folder is created on the filers page)


    }




}
