package Testscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import GENERICUTILITIES.Excelutility;
import GENERICUTILITIES.FILEUTILITY;
import GENERICUTILITIES.WEBDRIVERUTILITIES;

public class TC_01OPPERTUNITY {
	@Test
	public void createorganisation() throws Throwable {
		WEBDRIVERUTILITIES wutil=new WEBDRIVERUTILITIES();
		Excelutility e =new Excelutility();
		String oppname = e.getExcelData("Sheet1", 3, 2);
		
		
		System.setProperty("WebDriver.chrome.driver","./Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		FILEUTILITY file=new FILEUTILITY();
		
		String URL = file.getPropertyKeyValue("url");
 String username = file.getPropertyKeyValue("username");
		String password = file.getPropertyKeyValue("password");
		driver.manage().window().maximize();
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		//WebElement cp = driver.findElement(By.id("qccombo"));
		//Select s = new Select(cp);
		//s.selectByValue("Campaigns");
		//driver.findElement(By.name("campaignname")).sendKeys("hhhhhhh");
		//Thread.sleep(10);
		
	
		
		
		driver.findElement(By.linkText("Opportunities")).click();
		driver.findElement(By.xpath("//img[@alt='Create Opportunity...']")).click();
		driver.findElement(By.name("potentialname")).sendKeys(oppname);
		  driver.findElement(By.xpath(("(//img[@align='absmiddle'])[4]"))).click();
		  WEBDRIVERUTILITIES wh=new WEBDRIVERUTILITIES();
		  wh.switchToWindow(driver, "Campaigns");
		  driver.findElement(By.id("1")).click();
		  wh.switchToWindow(driver, "Potentials");
		 driver.findElement(By.xpath("(//img[@title='Select'])[1]")).click();
		 wh.switchToWindow(driver, "Accounts&action");
		  driver.findElement(By.id("1")).click();
		  wh.switchToWindow(driver, "Potentials");
		  
		  driver.findElement(By.xpath("(//input[@class='crmbutton small save'])[1]")).click();
		  
		 
		
		
		
		
		
		
		
		
		
		
	
		
		
		 
		
		



		
		
		
	}
}