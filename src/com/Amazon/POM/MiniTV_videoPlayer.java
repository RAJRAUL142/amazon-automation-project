package com.Amazon.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MiniTV_videoPlayer {
         @FindBy(xpath="//img[@alt='play']")
         private WebElement PlayPauseBtn;
         
         @FindBy(xpath="//img[@alt='backward']")
         private WebElement BackwardBtn;
         
         @FindBy(xpath="//img[@alt='forward']")
         private WebElement forwardBtn;
         
         @FindBy(xpath="//img[@alt='quality']")
         private WebElement QualityBtn;
         
         @FindBy(xpath="//img[@alt='subtitle']")
         private WebElement SubtitleBtn;
         
         @FindBy(xpath="//img[@alt='fullScreen']")
         private WebElement FullScreenBtn;
         
         @FindBy(xpath="//img[@alt='close']")
         private WebElement CloseBtn;
         
         
         ///////////////////////////////////////////////////////
         public MiniTV_videoPlayer(WebDriver driver) {
        	 PageFactory.initElements(driver,this);
         }
         //////////////////////////////////////////////////////////
		public WebElement getPlayPauseBtn() {
			return PlayPauseBtn;
		}
		public WebElement getBackwardBtn() {
			return BackwardBtn;
		}
		public WebElement getForwardBtn() {
			return forwardBtn;
		}
		public WebElement getQualityBtn() {
			return QualityBtn;
		}
		public WebElement getSubtitleBtn() {
			return SubtitleBtn;
		}
		public WebElement getFullScreenBtn() {
			return FullScreenBtn;
		}
		public WebElement getCloseBtn() {
			return CloseBtn;
		}
}
