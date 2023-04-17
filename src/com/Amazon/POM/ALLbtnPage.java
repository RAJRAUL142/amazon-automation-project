package com.Amazon.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ALLbtnPage {
     @FindBy(xpath="//a[.='Amazon miniTV- FREE entertainment']")
     private WebElement MiniTV;
     ////////////////////////////////////////////////////////////
     public ALLbtnPage(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
	public WebElement getMiniTV() {
		return MiniTV;
	}
     
     
    }
