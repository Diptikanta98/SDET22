package com.vtiger.concast.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyPage {
	

public VerifyPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		}
@FindBy(xpath="//span[@class='dvHeaderText']")
private WebElement vreifyfix;
public WebElement getVreifyfix() {
	return vreifyfix;
}
}