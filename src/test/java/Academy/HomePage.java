package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resource.Base;

public class HomePage extends Base{

	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		log.info("Driver is initialised");
			
	}
	
	@Test(dataProvider = "getData")
	public void basePageNavigation(String userName,String passWord) throws IOException	{
		driver.get(prop.getProperty("url"));
		log.info("Navigated to home page...");
		LandingPage LP=new LandingPage(driver);
		
		LP.getLogin().click();
		LoginPage LogP=new LoginPage(driver);
		LogP.getEmail().sendKeys(userName);
		LogP.getPassword().sendKeys(passWord);
		LogP.getLogin().click();
		
		
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] Data=new Object[2][2];
		Data[0][0]="maruf@mail.com";
		Data[0][1]="12345";
		Data[1][0]="mallick@mail.com";
		Data[1][1]="7890";
		return Data;		
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
