package com.Amazon.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
       @FindBy(xpath="(//div[@class='a-button-stack'])[4]")
       private WebElement AddToCart;
       
       @FindBy(xpath="//input[@id='buy-now-button']")
       private WebElement BuyNow;
       
       @FindBy(xpath="//input[@id='add-to-wishlist-button-submit']")
       private WebElement AddWishList;
       //////////////////////////////////////////////////////
       
       public ProductPage(WebDriver driver) {
    	   PageFactory.initElements(driver, this);
       }
       ////////////////////////////////////////////////////////////

	public WebElement getAddToCart() {
		return AddToCart;
	}

	public WebElement getBuyNow() {
		return BuyNow;
	}

	public WebElement getAddWishList() {
		return AddWishList;
	}
       
       
       
}
