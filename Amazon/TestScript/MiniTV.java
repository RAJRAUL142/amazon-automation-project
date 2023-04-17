package com.Amazon.TestScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Amazon.GernericLibrary.BaseClass;
import com.Amazon.POM.ALLbtnPage;
import com.Amazon.POM.HomePage;
import com.Amazon.POM.MiniTV_Homepage;
import com.Amazon.POM.MiniTV_videoPlayer;

public class MiniTV extends BaseClass{
       @Test
       public void amazonTV() throws InterruptedException {
    	 HomePage hp = new HomePage(driver);
    	 hp.getALLbtn().click();
    	 Thread.sleep(2000);
    	 ALLbtnPage all = new ALLbtnPage(driver);
    	 all.getMiniTV().click();
    	 Thread.sleep(3000);
    	 MiniTV_Homepage mini = new MiniTV_Homepage(driver);
    	 mini.getWebSeries().click();
    	 driver.findElement(By.xpath("//img[@alt='Physics Wallah - Season 1 - Watch Free']")).click();
    	 Thread.sleep(3000);
    	 mini.getWatchBtn().click();// click on watch button
    	 
    	 MiniTV_videoPlayer vp = new MiniTV_videoPlayer(driver);
    	 vp.getForwardBtn().click();
    	 Thread.sleep(3000);
    	 vp.getFullScreenBtn().click();
    	 Thread.sleep(3000);
    	 vp.getQualityBtn().click();
    	 Thread.sleep(3000);
    	 driver.findElement(By.xpath("//span[.='Data Saver']")).click();//for set quality to data saver
    	 vp.getPlayPauseBtn().click();
    	 Thread.sleep(3000);
    	 vp.getCloseBtn().click();
    	 
    	 
    	
       }
}
