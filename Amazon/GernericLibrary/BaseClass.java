package com.Amazon.GernericLibrary;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseClass {
	static {
  	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    }
    public static WebDriver driver;
    
    @BeforeSuite
    public void databaseConnection() {
  	  Reporter.log("database connected",true);
    }
    @AfterSuite
    public void databaseDisConnected() {
  	  Reporter.log("database dis-connected",true);
    }
    @BeforeClass
    public void launchBrowser() {
  	  ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        
  	 driver = new ChromeDriver(options);
  	driver.manage().window().maximize();
  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
  	Reporter.log("browser launch successfully",true);
    }
    
    @AfterClass
    public void closeBrowser() {
  	  driver.close();
  	  Reporter.log("logout successfully",true);
    }
    @BeforeMethod
    public void login() {
  	  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("7738789174");
  	  driver.findElement(By.xpath("//input[@id='continue']")).click();
  	  driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Rajraul@2001");
  	  driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
  	  Reporter.log("logged in successfully",true);
    }
    
    
    @AfterMethod
    public void logout() {
    	
  	  Reporter.log("logged out successfully",true);
    }
}


