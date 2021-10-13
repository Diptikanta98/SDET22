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

public class TC_04QUALIFICATION {
	@Test
	public void createorganisation() throws Throwable {
		WEBDRIVERUTILITIES wutil=new WEBDRIVERUTILITIES();
		Excelutility e =new Excelutility();
		
		
		
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
		 driver.findElement(By.linkText("Opportunities")).click();
		 driver.findElement(By.xpath("//img[@alt='Create Opportunity...']")).click();
		 WebElement op = driver.findElement(By.name("sales_stage"));
		 Select s = new Select (op);
		 s.selectByIndex(0);
		 driver.findElement(By.name("button")).click();
		 
		 
		
		
		
		
		
		
	}
}
		
			
		
		


