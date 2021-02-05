package com.trycloud.tests.Hoshang;

import com.utilities.BrowserUtils;
import com.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;

public class HoverOverAndAction {

    @Test
    public void hoverOverAndAction() {

//        TC	#15:	Hover	Test
//        1. Go	to	http://practice.cybertekschool.com/hovers
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

//        2. Hover	over	to	first	image
//        3. Assert:
//        a. “name:	user1”	is	displayed
//        4. Hover	over	to	second	image
//        5. Assert:
//        a. “name:	user2”	is	displayed
//        6. Hover	over	to	third	image
//        7. Confirm:
//        a. “name:	user3”	is	displayed
        Actions actions = new Actions(Driver.getDriver());

        List<WebElement> hoverOver3Elements = Driver.getDriver().findElements(By.xpath("//img[@src='/img/avatar-blank.jpg']"));

        int i = 1;
        for (WebElement eachElement : hoverOver3Elements) {
            BrowserUtils.sleep(3);
            actions.moveToElement(eachElement).perform();

         List<WebElement> userNames = Driver.getDriver().findElements(By.xpath("(//h5)["+i+"]"));
         for (WebElement eachUserName : userNames) {
             Assert.assertTrue(eachUserName.isDisplayed(), "Failed, it is not displayed");
         }
            i++;
        }

    }

}
