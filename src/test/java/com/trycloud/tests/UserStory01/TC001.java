package com.trycloud.tests.UserStory01;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001 extends TestBase {

    @Test
    public void VerificationOfURL() {

//        5. Verify the URL is changed to homepage’s url
//        (Put this test case in testBase class with an annotation so it runs for all the test case)

        //System.out.println(driver.getCurrentUrl());

 Assert.assertTrue(driver.getCurrentUrl().equals("https://app.trycloud.net/index.php/apps/files/?dir=/&fileid=22622"),
                "Failed, The URL is not the same");

 // comment
"//*[@id='appmenu']/li/span"
    }




}
