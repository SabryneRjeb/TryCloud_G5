package com.trycloud.tests.userStory06;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TC002 extends TestBase {

    @Test
    public void sendNotes (){


        WebElement talkModule=driver.findElement(By.xpath(("(//a[@aria-label='Talk'])[1]")));
        talkModule.click();

        WebElement employeeName1=driver.findElement(By.xpath("(//a[@class='app-navigation-entry-link'])[1]"));
        employeeName1.click();

        WebElement inputBox=driver.findElement(By.xpath("//input[@class='submit icon-confirm has-tooltip']"));
        inputBox.sendKeys(Keys.ENTER+"Note Module does not work"+Keys.ENTER);

        //This is also failing since there is no Note Module



                }
}
