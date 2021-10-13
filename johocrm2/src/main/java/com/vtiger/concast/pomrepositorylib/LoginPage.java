package com.vtiger.concast.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage 

{
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(name="user_name")
	private WebElement usernameedt;
	@FindBy(name="user_password")
	private WebElement passwordedt;
	@FindBy(id="submitButton")
	private WebElement loginbtn;
	public WebElement getUsernameedt() {
		return usernameedt;
	}
	public WebElement getPasswordedt() {
		return passwordedt;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public void login(String USERNAME,String PASSWORD) {
		usernameedt.sendKeys(USERNAME);
		passwordedt.sendKeys(PASSWORD);
		loginbtn.click();
	}


}





