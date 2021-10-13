package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GENERICUTILITIES.Excelutility;
import GENERICUTILITIES.WEBDRIVERUTILITIES;

public class Debug {
	@Test
	public void CreateOpp1() {
		
		//public static void main(String[] args) {
		//String oppName= "Comcast_1";
		//Excelutility elib =new Excelutility();
		//WEBDRIVERUTILITIES w = new WEBDRIVERUTILITIES();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		

}
}
