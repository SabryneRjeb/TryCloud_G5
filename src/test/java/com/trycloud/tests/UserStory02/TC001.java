package com.trycloud.tests.UserStory02;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class TC001 extends TestBase {

    @Test
    public void accessToMainModulesTest(){
     List<WebElement> allModules = driver.findElements(By.xpath("//*[@id=\"appmenu\"]/li/a"));
     allModules.remove(allModules.size()-1);
        String[] actualModules = new String[7];
        String[] expectedModules = {"Files","Galleries","Activity","Talk","Contacts","Calender","Note"};
        int count = 0;
        for (WebElement eachModule : allModules) {
            System.out.println("eachModule = " + eachModule.getAttribute("aria-label"));
            Assert.assertTrue(eachModule.isDisplayed());
/*
Files Galleries Activity Talk Contacts Calendar Note
 */

            actualModules[count++] = eachModule.getAttribute("aria-label");
        }
        System.out.println(actualModules.length);
        System.out.println(allModules.size());
        System.out.println(Arrays.toString(actualModules));
        System.out.println(Arrays.toString(expectedModules));

        Assert.assertEquals(actualModules,expectedModules, "Failed, Module Values Are not equal");

    }
}
