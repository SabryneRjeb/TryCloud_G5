package com.trycloud.tests.Kamal;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory03_TC008_2 extends TestBase {


    @Test

    public void comments (){
        // 2.Click action-icon from any file on the page
        WebElement actionIcon=driver.findElement(By.xpath("(//span[@class='icon icon-more'])[3]"));
        actionIcon.click();

        // 3.Click details

        WebElement detailButton= driver.findElement(By.xpath("(//span[.='Details'])[1]"));
        detailButton.click();

        // 4.Write a comment inside to the input box
        WebElement Comments = driver.findElement(By.xpath("//span[@class='icon icon-comment']"));
        Comments.click();
        WebElement newComment = driver.findElement(By.xpath("//div[@class='message']"));
        newComment.sendKeys("You are being Tested");

        // 5.Click the submit button to post it
        WebElement submitButton = driver.findElement(By.xpath("//input[@class='submit icon-confirm has-tooltip']"));
        submitButton.click();

        // 6.Verify the comment is displayed in the comment section.
        WebElement displayComment = driver.findElement(By.xpath("//div[@class='date has-tooltip live-relative-timestamp']"));
        Assert.assertTrue(displayComment.isDisplayed());




    }
}
