package com.trycloud.tests.Sabryne;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase3_3 extends TestBase {


//Test case #3 - verify users can add a file to favorites.
//1. Login as a user
//2. Click action-icon from any file on the page
//3. Choose “Add to Favorites” option
//4. Click “Favorites” sub-module on the lest side
//5. Verify the chosen file is listed on the table
//(Pre-condition: there should be at least 1 file is uploaded)
    @Test

    public void usersCanAddFileToFavorites() throws InterruptedException {

       // WebElement locationFolder4 = driver.findElement(By.xpath("//a[@href='/index.php/apps/files?dir=//Group4Folder']"));
        //Thread.sleep(2000);
        //locationFolder4.click();
       // WebElement locatingTheG4Folder = driver.findElement(By.xpath("(//span[@class='nametext'])/span[.='group5']"));
       // Thread.sleep(2000);
        //locatingTheG4Folder.click();
       // WebElement selectFolder4 = driver.findElement(By.xpath("//label[@for='select-files-85115']"));
        //Thread.sleep(2000);
       // selectFolder4.click();



        WebElement locatingTheG5Folder = driver.findElement(By.xpath("(//span[@class='nametext'])/span[.='group5']"));

        WebElement iconButton =driver.findElement(By.xpath("(//a[@class='action action-menu permanent'])[4]"));
        Thread.sleep(2000);
         iconButton.click();

        WebElement addToFavorite = driver.findElement(By.xpath("//a[@data-action='Favorite']"));
        Thread.sleep(2000);
        addToFavorite.click();


        WebElement favoriteFolder = driver.findElement(By.tagName("ul#sublist-favorites"));
       Thread.sleep(2000);
       favoriteFolder.click();









       // WebElement locatingTheG4Folder = driver.findElement(By.xpath("(//span[@class='nametext'])/span[.='Group4Folder']"));




    }




}
