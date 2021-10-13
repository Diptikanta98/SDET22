package GENERICUTILITIES;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.vtiger.concast.pomrepositorylib.LoginPage;
import com.vtiger.concast.pomrepositorylib.homepage;

/**
 * This Class Contains basic configuration annotations of testng
 * @author GUDU
 *
 */

public class BaseClass {
	public DataBaseUtility dlib=new DataBaseUtility();
	public FILEUTILITY pLib=new FILEUTILITY();
	public WEBDRIVERUTILITIES Wlib=new WEBDRIVERUTILITIES();
	public Excelutility Elib=new Excelutility();
	public JAVAUTILITIES Jlib=new JAVAUTILITIES();
	public WebDriver driver;

	@BeforeSuite
	public void connectDB() throws Throwable
	{
		//dlib.connectToDB();
		System.out.println("========DB Connection successfull========");

	}
	@BeforeClass
	public void lunchBrowser() throws Throwable
	{
		//read data from property file
		String BROWSER =pLib.getPropertyKeyValue("browser");
		String URL=pLib.getPropertyKeyValue("url");
		

		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();

		}
		else if (BROWSER.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();

		}
		else
		{
			System.out.println("invalid browser name");

		}
		System.out.println("=====browser lunch sucessfull=====");

		Wlib.maximizewindow(driver);

		Wlib.waitUntilPageLoad(driver);

		driver.get(URL);
	}
	@BeforeMethod
	public void loginToApp() throws Throwable 
	{
		//
		String USERNAME = pLib.getPropertyKeyValue("username");
		String PASSWORRD = pLib.getPropertyKeyValue("password");

		//
		LoginPage lp=new LoginPage(driver);
		lp.login(USERNAME,PASSWORRD);
		System.out.println("login successful");

	}
	@AfterMethod
	public void logoutofApp() throws Throwable 
	{

		homepage hp=new homepage(driver);
		hp.clickonSignout();
		System.out.println("sign out sucessful");
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
		System.out.println("browser closed");

	}

	@AfterSuite
	public void closedDB() throws Throwable 
	{
		dlib.closeDb();
		System.out.println("db connection closed");
	}
}






