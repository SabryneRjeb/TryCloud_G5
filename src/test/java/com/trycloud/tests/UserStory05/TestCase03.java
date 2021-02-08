package com.trycloud.tests.UserStory05;

import com.trycloud.tests.base.TestBase2;
import com.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestCase03 extends TestBase2 {

    //Test case #3 - verify users can see all the contact names on the contact list
    //1. Login as a user
    //2. Click contacts module
    //3. Verify the contact names are in the list
    //(Pre-condition: there should be at least 2 contact names are displayed On the contact list)



    @Test

    public void allContactNamesOnTheList(){
        //2. Click contacts module
        WebElement contactMenu = driver.findElement(By.xpath("(//a[@aria-label='Contacts'])[1]"));
        BrowserUtils.sleep(2);
        contactMenu.click();
        //3. Verify the contact names are in the list
        List<WebElement> contactList = driver.findElements(By.xpath("//div[@class='vue-recycle-scroller__item-wrapper']"));

        for(WebElement eachContact: contactList){
            if(contactList.contains(eachContact.getText())) {
                Assert.assertTrue(eachContact.isDisplayed(), "Contacts are not displayed");
                System.out.println(eachContact.getText());
            }else{
                System.out.println("Contacts are not displayed!!!!");
            }

        }




    }


}
