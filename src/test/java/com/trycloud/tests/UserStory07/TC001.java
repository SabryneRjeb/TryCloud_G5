package com.trycloud.tests.UserStory07;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001 extends TestBase {
    //7.Story: As a user, I should be able to access search any item/ users from the homepage.
    // Test case #1 - Verify users can search any files/folder/users from the search box.
    // 1.Login as a user
    // 2.Click magnifier icon         on the right top
    // 3.Search any existing file/folder/user name
    // 4.Verify the app displays the expected result option
    @Test
    public void verify_searching_files(){
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='searchbox']"));
        searchBox.click();
        searchBox.sendKeys("Selenium");
        searchBox.click();

        WebElement actualText = driver.findElement(By.xpath("//tr[@data-id='22653']//span[@class='nametext']/span"));
        String actualResult = actualText.getText();
        String expectedResult = "Selenium";
        Assert.assertEquals(expectedResult,actualResult);

    }
}
