package com.vtiger.concast.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BacktoHomepage {
	public BacktoHomepage (WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//img[@src='themes/softed/images/Home.PNG']")
	 private WebElement homebtn;

	public WebElement getHomebtn() {
		return homebtn;
	}
	
}
