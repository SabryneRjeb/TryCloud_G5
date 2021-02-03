package com.trycloud.tests.Sabryne;

import com.trycloud.tests.base.TestBase;
import com.trycloud.tests.base.TestBase2;
import com.trycloud.tests.yalcin.Yalcin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class UserStory5_TestCase001 extends TestBase2 {
//Test case #3 - verify users can see all the contact names on the contact list
//1. Login as a user
//2. Click contacts module
//3. Verify the contact names are in the list
//(Pre-condition: there should be at least 2 contact names are displayed On the contact list)


    @Test

    public void allNamesOnTheLIst() throws InterruptedException {

//2. Click contacts module

        WebElement contactsModule = driver.findElement(By.xpath("//a[@aria-label='Contacts']"));
        Thread.sleep(2000);
        contactsModule.click();

        //3. Verify the contact names are in the list

        WebElement nameList = driver.findElement(By.xpath("//div[@class='vue-recycle-scroller__item-wrapper']"));

        WebElement Hoshang = driver.findElement(By.xpath("//div[@id='MTZiZTU1YWQtNDQ3Mi00MTRjLTg4YzUtMWQwOTZhOTcwMWU1fmNvbnRhY3']"));
        WebElement Sabryne = driver.findElement(By.xpath("//div[@id='MWY4N2ZjY2EtMmRmYS00YjYxLTlhMDYtYzY0MmZkNzFmZmVkfmNvbnRhY3']"));
        WebElement Valeria = driver.findElement(By.xpath("//div[@id='YmM4YWEyNDQtNDcxOC00ZGE2LWI1OWQtZGY0ODNiOTU4MjY0fmNvbnRhY3']"));
        WebElement Yalcin = driver.findElement(By.xpath("//div[@id='OGVlOGU2OTMtYmU1Mi00N2JhLThjMTQtOTlkZDQ2ZjQxOGFjfmNvbnRhY3']"));

        List<WebElement> allNames = new ArrayList<>(Arrays.asList(Hoshang,Valeria,Sabryne,Yalcin)) ;


        ArrayList<String> expectedNames = new ArrayList<>(Arrays.asList("Hoshang Wardak","Sabryne Rjeb","Valeria Marasan ","Yalcin Seyhan"));

        for (WebElement eachName : allNames) {
           Assert.assertTrue(eachName.isDisplayed(),"Verification failed");
        }










    }






}
