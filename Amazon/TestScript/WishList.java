package com.Amazon.TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Amazon.GernericLibrary.BaseClass;
import com.Amazon.POM.HomePage;
import com.Amazon.POM.ProductPage;
import com.Amazon.POM.YourAccount;

public class WishList extends BaseClass{
     @Test
     public void Whitelist() throws InterruptedException {
    	HomePage hp = new HomePage(driver);
   	
    	Thread.sleep(3000);
      	hp.getSearchBar().sendKeys("samsung s23");
    	Thread.sleep(3000);
    	hp.getSearchBtn().click();
    	driver.findElement(By.xpath("(//span[.='Samsung Galaxy S23 5G (Green, 8GB, 256GB Storage)'])[1]")).click();
   	
         //product page
    	ProductPage pp = new ProductPage(driver);
    	Thread.sleep(5000);
    	pp.getAddWishList().click();
    	
    	String object1 = driver.findElement(By.xpath("//button[@class=' a-button-close a-declarative']")).getText();
    	System.out.println(object1);
    	driver.findElement(By.xpath("//button[@class=' a-button-close a-declarative']")).click();//click on cross button
    	
    	WebElement yourACC = hp.getYourAccount();
    	Actions a = new Actions(driver);
    	a.moveToElement(yourACC).perform();
    	Thread.sleep(3000);
    	//go to your acc floating tab
    	YourAccount ya = new YourAccount(driver);
    	ya.getYourWishList().click();
    	Thread.sleep(2000);
    	String object2 = driver.findElement(By.xpath("(//a[@title='Samsung Galaxy S23 5G (Green, 8GB, 256GB Storage)'])[2]")).getText();
    	System.out.println(object2);
    	//Verification
    	 SoftAssert s = new SoftAssert();     
         s.assertEquals(object1, object2);
         Reporter.log("assertion pass",true);
         s.assertAll();
         //for delete product from wishlist
         driver.findElement(By.xpath("//input[@name='submit.deleteItem']")).click();         	
     }
}
