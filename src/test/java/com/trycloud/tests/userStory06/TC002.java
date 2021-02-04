package com.trycloud.tests.userStory06;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TC002 extends TestBase {

    @Test
    public void sendNotesDeck (){

        WebElement deckModule=driver.findElement(By.xpath(("(//a[@aria-label='Deck'])[1]")));
        deckModule.click();

        WebElement createNotes=driver.findElement(By.xpath("//a[@class='icon-add app-navigation-noclose']"));
        createNotes.click();

        WebElement noteInput=driver.findElement(By.xpath("//input[@placeholder='New board title']"));

        noteInput.sendKeys(Keys.ENTER+"www"+ Keys.ENTER);

        WebElement sentItNote= driver.findElement(By.xpath("//div[.='www']"));

        Assert.assertTrue(sentItNote.isDisplayed(), "Note failed");








                }
}
