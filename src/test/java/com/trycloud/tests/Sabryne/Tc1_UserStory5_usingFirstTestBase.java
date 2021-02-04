package com.trycloud.tests.Sabryne;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Tc1_UserStory5_usingFirstTestBase extends TestBase {


    //Test case #3 - verify users can see all the contact names on the contact list
    //1. Login as a user
    //2. Click contacts module
    //3. Verify the contact names are in the list
    //(Pre-condition: there should be at least 2 contact names are displayed On the contact list)


    @Test
    public void userCanSeeAllNamesOnContactList() throws InterruptedException {

        WebElement contactsModule = driver.findElement(By.xpath("//div[@class='icon-contacts menutoggle']"));
        Thread.sleep(2000);
        contactsModule.click();

        WebElement  contactsMenu = driver.findElement(By.xpath("//div[@id='contactsmenu-menu']"));
        WebElement contactList = driver.findElement(By.xpath("//div[@id='contactsmenu-contacts']"));
        //3. Verify the contact names are in the list

        Assert.assertTrue(contactsMenu.getText().contains(contactList.getText()),"Verification failed!!");



    }



}
