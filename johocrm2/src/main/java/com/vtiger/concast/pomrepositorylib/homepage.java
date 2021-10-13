package com.vtiger.concast.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GENERICUTILITIES.WEBDRIVERUTILITIES;

public class homepage  {
	public WebDriver driver;
	public homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath = "//a[text()='Opportunities']")
	private WebElement addimg;
		@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
		private WebElement profileimg;
		@FindBy(linkText = "Sign Out")
		private WebElement signoutlnk;
		
		public WebElement getAddimg() {
			return addimg;
		}

		public WebElement getProfileimg() {
			return profileimg;
		}
		public WebElement getSignoutlnk() {
			return signoutlnk;
		}

		
		public void clickonSignout() throws Throwable {
			WEBDRIVERUTILITIES w=new WEBDRIVERUTILITIES();
			w.mouseOver(driver, profileimg);
			Thread.sleep(2000);
			signoutlnk.click();
	}
		
		}
	
			
		


