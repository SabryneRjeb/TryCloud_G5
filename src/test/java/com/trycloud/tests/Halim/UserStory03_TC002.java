package com.trycloud.tests.Halim;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserStory03_TC002 extends TestBase {

    @Test
    public void selectAllUploadedFilesTest(){

        WebElement selectAllInputBox = driver.findElement(By.xpath("//label[@for='select_all_files']"));
        selectAllInputBox.click();

        List<WebElement> allFiles = new ArrayList<>();
        allFiles.addAll(driver.findElements(By.xpath("//tbody[@id='fileList']/tr/td/label")));
        for (WebElement each : allFiles){
            Assert.assertTrue(each.isEnabled());
        }

       /* WebElement row1CheckBox = driver.findElement(By.xpath("//label[@for='select-files-83152']"));
        row1CheckBox.click();
        if (row1CheckBox.isEnabled()){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
*/

    }
}
