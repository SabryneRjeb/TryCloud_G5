package com.trycloud.tests.userStory06;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TC001 extends TestBase {




    @Test
    public void deckModule() throws InterruptedException {


        WebElement deckModule=driver.findElement(By.xpath(("(//a[@aria-label='Deck'])[1]")));
        deckModule.click();
String actualTitle= driver.getTitle();
String expectedTitle="Deck - Trycloud";


        System.out.println(actualTitle);

        boolean isequal=actualTitle.equals(expectedTitle);

        Assert.assertTrue(isequal,"Is failed");


    }
}
