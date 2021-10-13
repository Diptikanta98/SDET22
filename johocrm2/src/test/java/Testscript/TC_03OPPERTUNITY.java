package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import GENERICUTILITIES.Excelutility;
import GENERICUTILITIES.FILEUTILITY;
import GENERICUTILITIES.WEBDRIVERUTILITIES;

public class TC_03OPPERTUNITY {

@Test
	public void createorganisation() throws Throwable {
		WEBDRIVERUTILITIES wutil=new WEBDRIVERUTILITIES();
		Excelutility e =new Excelutility();
		String opp = e.getExcelData("Sheet1",5,3);
		
		
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
		WebElement sp = driver.findElement(By.name("sales_stage"));
		Select s1 = new Select(sp);
		s1.selectByValue(opp);
		

}
}
