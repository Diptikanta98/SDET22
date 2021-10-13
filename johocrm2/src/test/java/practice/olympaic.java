package practice;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GENERICUTILITIES.WEBDRIVERUTILITIES;

public class olympaic {


	@Test
	public void CreateOpp2() {
		
		//public static void main(String[] args) {
		//String oppName= "Comcast_1";
		//Excelutility elib =new Excelutility();
		WEBDRIVERUTILITIES w = new WEBDRIVERUTILITIES();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://olympics.com/");
		driver.findElement(By.xpath("//img[@alt='Simone BILES']")).click();
		driver.findElement(By.xpath("//span[text()='Simone BILES']")).click();
		//driver.findElement(By.className("ot-sdk-three ot-sdk-columns")).click();
	

}
}
