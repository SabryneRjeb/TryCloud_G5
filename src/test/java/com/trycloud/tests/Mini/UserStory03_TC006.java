package com.trycloud.tests.Mini;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class UserStory03_TC006 extends TestBase {

    @Test
    public void test(){






        //3.Story: As a user, I should be able to access to Files module.
        // Test case #6 - verify users can create a folder
        // 1.Login as a user
        // 2.Click the “+” icon on top

        WebElement square= driver.findElement(By.xpath("//label[@id='view-toggle']"));
        square.click();
        WebElement plusButton= driver.findElement(By.xpath("//a[@class='button new']"));
        plusButton.click();
        // 3.Click “New Folder”
        WebElement ButtonNew= driver.findElement(By.xpath("//a[@class='menuitem']/span"));
        ButtonNew.click();
        // 4.Write a folder name
        WebElement inputBox= driver.findElement(By.xpath("//input[@id='view29-input-folder']"));
        inputBox.sendKeys("group5_1");
        // 5.Click submit icon
        WebElement submitArrow= driver.findElement(By.xpath("//input[@class='icon-confirm']"));
        submitArrow.click();

        WebElement folder= driver.findElement(By.xpath("(//span[@class='innernametext'])[2]"));
        // 6.Verify the folder is displayed on the page
        Assert.assertTrue(folder.isDisplayed());


/*
//to remove so we can try again later

        //2. Click action-icon from any file on the page
        WebElement actionIcon=driver.findElement(By.xpath("((//span[@class='icon icon-more'])[3]"));
        actionIcon.click();

        //3. Choose “delete files” option
        WebElement deleteButton= driver.findElement(By.xpath("(//span[.='Delete'])[2]"));
        deleteButton.click();


*/


    }

}
