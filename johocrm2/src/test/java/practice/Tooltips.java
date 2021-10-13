package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Tooltips {
	@Test
	public void CreateOpp1() {
		
		//public static void main(String[] args) {
		//String oppName= "Comcast_1";
		//Excelutility elib =new Excelutility();
		//WEBDRIVERUTILITIES w = new WEBDRIVERUTILITIES();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/tool-tips");
		WebElement hower = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		Actions act=new Actions(driver);
		act.moveToElement(hower).perform();
		//String textfield2 = hower.getText();
		WebElement text = driver.findElement(By.xpath("//div[text()='You hovered over the Button']"));
		String text1 = text.getText();
	WebElement textfeild = driver.findElement(By.xpath("//input[@placeholder=\"Hover me to see\"]"));	
		
		textfeild.sendKeys(text1);

}
}
