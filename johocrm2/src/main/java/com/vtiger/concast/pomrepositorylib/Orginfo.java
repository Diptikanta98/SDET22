package com.vtiger.concast.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orginfo {
	
public Orginfo (WebDriver driver) {
		
		PageFactory.initElements(driver,this);

}

@FindBy(id="1")
private WebElement wppinfo;

public WebElement getWppinfo() {
	return wppinfo;
}
}
