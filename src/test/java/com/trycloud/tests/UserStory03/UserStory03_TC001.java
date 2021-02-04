package com.trycloud.tests.UserStory03;

import com.trycloud.tests.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory03_TC001 extends TestBase {

    @Test
    public void accessFileModuleTest(){

        String actualTitle = driver.getTitle();
        String expectedTitle = "Files - Trycloud";

        Assert.assertTrue(expectedTitle.equals(actualTitle));

    }
}
