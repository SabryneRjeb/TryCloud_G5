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
public class abc extends TestBase {
    @Test
    public void selectAllUploadedFilesTest(){
        //WebElement selectAllInputBox = driver.findElement(By.xpath("//label[@for='select_all_files']"));
        //selectAllInputBox.click();
        //List<WebElement> allFiles = new ArrayList<>();
        /*allFiles.addAll(driver.findElements(By.xpath("//tbody[@id='fileList']/tr[1]/td")));
        for (WebElement each : allFiles){
            Assert.assertTrue(each.isSelected());
        }
         */
      List  <WebElement> row1CheckBox = driver.findElements(By.xpath("//*[@id='fileList']/tr[1]/td"));

        for (WebElement checkBox : row1CheckBox) {
            System.out.println("checkBox.isEnabled() = " + checkBox.isEnabled());

        }
    }
}