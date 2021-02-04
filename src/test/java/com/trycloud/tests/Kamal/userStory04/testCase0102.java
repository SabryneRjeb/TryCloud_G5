package com.trycloud.tests.Kamal.userStory04;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase0102 extends TestBase {
    @Test

    public void talkModules (){
        //Test case #1 - verify users can access to Talks module
        //1.Login as a user2.
        // Click Talks module3.Verify the page tile is Talks module’s tile
        WebElement talks = driver.findElement(By.xpath("//a[@aria-label='Talk']"));
        talks.click();

            //1.Login as a user
            // 2.Click Talks module
            // 3.Search a user from search box on the left
            // 4.Write a message
            // 5.Click submit button
            // 6.Verify the message is displayed on the conversation log


        WebElement chat = driver.findElement(By.xpath("//div[@data-user='Employee1']"));
        chat.click();
        WebElement message = driver.findElement(By.xpath("//div[@class='message']"));
        message.sendKeys("You are being Tested");
        WebElement send = driver.findElement(By.xpath("//input[@class='submit icon-confirm has-tooltip']"));
        send.click();


    }

    }


