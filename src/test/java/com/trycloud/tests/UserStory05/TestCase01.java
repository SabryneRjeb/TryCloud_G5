package com.trycloud.tests.UserStory05;

import com.trycloud.tests.base.TestBase2;
import com.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase01 extends TestBase2 {


    //Test case #1 - verify users can access to Talks module
    //1. Login as a user
    //2. Click “Contacts” module
    //3. Verify the page tile is Contents module’s tile


    @Test

    public void usersCanAccessContactModule() {

        WebElement contactMenu = driver.findElement(By.xpath("(//a[@aria-label='Contacts'])[1]"));
        BrowserUtils.sleep(2);
        contactMenu.click();


        String expectedTitle = "Contacts - Trycloud";

        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        Assert.assertEquals(expectedTitle, actualTitle, "Title does not match");
    }



}
