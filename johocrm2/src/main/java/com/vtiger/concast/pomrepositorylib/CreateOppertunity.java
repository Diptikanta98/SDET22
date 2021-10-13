package com.vtiger.concast.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOppertunity {
	
		public CreateOppertunity(WebDriver driver) {
			PageFactory.initElements(driver, this);
		
		}
		
		
		
		@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
		private WebElement createopp;
		
		@FindBy(xpath="//img[@title='Select']")
		private WebElement creteoppimage;

		
		
		
		public WebElement getCreateopp() {
			return createopp;
			
		}
		public WebElement getCreteoppimage() {
			return creteoppimage;
			
		
			
		}
		
		public void clickOnCreateNewOppBtn() {
			creteoppimage.click();
			
		}
}
			

		



