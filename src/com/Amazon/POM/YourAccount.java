package com.Amazon.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAccount {
  @FindBy(xpath="//span[.='Your Account']")
  private WebElement YourAccount;
  
  @FindBy(xpath="//span[.='Your Orders']")
  private WebElement YourOrder;
  
  @FindBy(xpath="(//span[.='Your Wish List'])[2]")
  private WebElement YourWishList;
  /////////////////////////////////////////////////
  
  public YourAccount(WebDriver driver) {
	  PageFactory.initElements(driver, this);
  }
  //////////////////////////////////////////////////////////////

public WebElement getYourAccount() {
	return YourAccount;
}

public WebElement getYourOrder() {
	return YourOrder;
}

public WebElement getYourWishList() {
	return YourWishList;
}
  
  
}
