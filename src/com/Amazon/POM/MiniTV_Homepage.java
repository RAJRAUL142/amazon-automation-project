package com.Amazon.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MiniTV_Homepage {
    @FindBy(xpath="//h1[.='Home']")
    private WebElement home;
    
    @FindBy(xpath="//h1[.='Web Series']")
    private WebElement WebSeries;
    
    @FindBy(xpath="//h1[.='mini Movies']")
    private WebElement MiniMovies;
    
    @FindBy(xpath="//h1[.='Comedy']")
    private WebElement Comedy;
    
    @FindBy(xpath="//img[@alt='Click to visit Amazon Store']")
    private WebElement GoToAmazon;
    
    @FindBy(xpath="//img[@alt='settings']")
    private WebElement Settings;
    
    @FindBy(xpath="(//button[@type='button'])[1]")
    private WebElement WatchBtn;
    
    
	//////////////////////////////////////////////////////////////////////////
    public MiniTV_Homepage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    ////////////////////////////////////////////////////////////////////////////////
	public WebElement getHome() {
		return home;
	}
	public WebElement getWebSeries() {
		return WebSeries;
	}
	public WebElement getMiniMovies() {
		return MiniMovies;
	}
	public WebElement getComedy() {
		return Comedy;
	}
	public WebElement getGoToAmazon() {
		return GoToAmazon;
	}
	public WebElement getSettings() {
		return Settings;
	}
	public WebElement getWatchBtn() {
		return WatchBtn;
	}
    
    
}
