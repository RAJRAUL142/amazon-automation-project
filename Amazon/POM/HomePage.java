package com.Amazon.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//a[@id='nav-hamburger-menu']")
	private WebElement ALLbtn;

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
    private WebElement SearchBar;
    
    @FindBy(xpath="//input[@id='nav-search-submit-button']")
    private WebElement SearchBtn;
    
    @FindBy(xpath="//a[@id='icp-nav-flyout']")
    private WebElement SelectLang;
    
    @FindBy(xpath="//span[@class='nav-line-2 ']")
    private WebElement YourAccount;
    
    @FindBy(xpath="//a[@id='nav-orders']")
    private WebElement YourOrder;
    
    @FindBy(xpath="//a[@id='nav-cart']")
    private WebElement YourCart;
    //////////////////////////////////////////////////////////////////
    
    public HomePage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
//////////////////////////////////////////////////////////////////////////
	public WebElement getSearchBar() {
		return SearchBar;
	}

	public WebElement getSearchBtn() {
		return SearchBtn;
	}

	public WebElement getSelectLang() {
		return SelectLang;
	}

	public WebElement getYourAccount() {
		return YourAccount;
	}

	public WebElement getYourOrder() {
		return YourOrder;
	}

	public WebElement getYourCart() {
		return YourCart;
	}
	
	public WebElement getALLbtn() {
		return ALLbtn;
	}
    
}

	