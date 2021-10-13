package com.vtiger.concast.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GENERICUTILITIES.WEBDRIVERUTILITIES;

public class CreatingNewOpportunityPage {
	public CreatingNewOpportunityPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 @FindBy(name="potentialname")
	 private WebElement createoppbtn;
	 @FindBy(xpath="//input[@id='related_to_display']/following-sibling::img")
	 private WebElement clickonplusbtn;
	 @FindBy(name="opportunity_type")
	 private WebElement Typenb;
	 @FindBy(name="amount")
	 private WebElement Amt;
	 @FindBy(name="closingdate")
	 private WebElement Datebtn;
	 
	 @FindBy(name="sales_stage")
	 private WebElement salestagebtn;
	 @FindBy(id="probability")
	 private WebElement Pers;
	 
	 @FindBy(name="button")
	 private WebElement savebtn;
	 
	 //@FindBy(xpath="//img[@src='themes/softed/images/Home.PNG']")
	 //private WebElement homebtn;
	 
	//public WebElement getHomebtn() {
		//return homebtn;
	//}
	public WebElement getCreateoppbtn() {
		return createoppbtn;
	}
	public WebElement getClickonplusbtn() {
		return clickonplusbtn;
	}
	
	
	
	public WebElement getTypenb() {
		return Typenb;
	}
	public WebElement getAmt() {
		return Amt;
	}
	public WebElement getDatebtn() {
		return Datebtn;
	}
	public WebElement getSalestagebtn() {
		return salestagebtn;
	}
	
	public WebElement getPers() {
		return Pers;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	public void Typenb () {
		WEBDRIVERUTILITIES f = new WEBDRIVERUTILITIES();
		f.select(Typenb, 2);
	}
	public void Amt() {
		Amt.sendKeys("100");	
	}
	public void  Datebtn() {
		Datebtn.click();
	}
	public void Pers() {
		Pers.sendKeys("50");
	}
	
	public void salestageQa () {
	WEBDRIVERUTILITIES w = new WEBDRIVERUTILITIES();
	w.select(salestagebtn, 1);
	}
	public void salestageNa () {
		WEBDRIVERUTILITIES w = new WEBDRIVERUTILITIES();
		w.select(salestagebtn, 2);
		}

	public void salestageVp () {
		WEBDRIVERUTILITIES w = new WEBDRIVERUTILITIES();
		w.select(salestagebtn, 3);
		}
	public void salestageIdm () {
		WEBDRIVERUTILITIES w = new WEBDRIVERUTILITIES();
		w.select(salestagebtn, 4);
		}
	public void salestageICl () {
		WEBDRIVERUTILITIES w = new WEBDRIVERUTILITIES();
		w.select(salestagebtn, 9);
		}
}


	

	 
			 
	 
	
	


