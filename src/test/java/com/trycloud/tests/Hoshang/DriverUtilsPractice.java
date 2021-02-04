package com.trycloud.tests.Hoshang;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DriverUtilsPractice {

    @Test
    public void googleSearchTest() {

        Driver.getDriver().get(ConfigurationReader.getProperty("googleUrl"));

        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));

        String searchValue = "wooden spoon";

        searchBox.sendKeys(searchValue + Keys.ENTER);

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = searchValue;

        Assert.assertTrue(actualTitle.contains(expectedTitle), "Failed, Titles are not the same");

        Driver.closeDriver();


    }

}
