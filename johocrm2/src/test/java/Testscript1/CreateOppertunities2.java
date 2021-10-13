 package Testscript1;



import org.testng.annotations.Test;

import com.vtiger.concast.pomrepositorylib.CreateOppertunity;
//import com.vtiger.concast.pomrepositorylib.CreateQualification;
import com.vtiger.concast.pomrepositorylib.CreatingNewOpportunityPage;
import com.vtiger.concast.pomrepositorylib.Orginfo;
import com.vtiger.concast.pomrepositorylib.VerifyPage;
import com.vtiger.concast.pomrepositorylib.homepage;

import GENERICUTILITIES.BaseClass;
import GENERICUTILITIES.Excelutility;
import GENERICUTILITIES.WEBDRIVERUTILITIES;

public class CreateOppertunities2 extends BaseClass {
@Test(groups="Smokesuite")

public void Opp2() {
	
	//public static void main(String[] args) {
	//String oppName= "Comcast_1";
	Excelutility elib =new Excelutility();
	WEBDRIVERUTILITIES w = new WEBDRIVERUTILITIES();
	//WebDriver driver=new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//driver.get("http://localhost:8888");
	// LoginPage l =new  LoginPage(driver);
	 //l.login( "admin", "admin");  
	 
	 
	homepage h=new homepage(driver);
	h.getAddimg().click();
	CreateOppertunity c= new CreateOppertunity(driver);
	c.getCreateopp().click();
	
	CreatingNewOpportunityPage o = new CreatingNewOpportunityPage(driver);
	o.getCreateoppbtn().sendKeys("dipti");
	
	CreatingNewOpportunityPage op = new CreatingNewOpportunityPage(driver);
	op.getClickonplusbtn().click();
	
	
	
	w.switchToWindow(driver, "Accounts&action");
	
	Orginfo hp=new Orginfo(driver);
	hp.getWppinfo().click();
	w.switchToWindow(driver, "Potentials&action");
	
	CreatingNewOpportunityPage tp = new CreatingNewOpportunityPage(driver);
	tp.salestageQa();
	tp.getSavebtn().click();
	//homepage o=new homepage(driver);
	
	VerifyPage rp = new VerifyPage(driver);
	String actual = rp.getVreifyfix().getText();
	
	if(actual.contains("dipti")) {
		System.out.println("opp is created sucessfully>pass");
		driver.close();
	}
	
	else {
		System.out.println("opp is not created sucessfully>fail");
		driver.close();
	}
	
	
	}

}
