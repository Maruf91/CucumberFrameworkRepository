package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	//public String LOGIN_LINK_CLICK="//a[contains(@href,'https://rahulshettyacademy.com/sign_in/')]";
	public String LOGIN_LINK_CLICK="//a[contains(text(),'Login')]";
	public String HOME_PAGE_Title="//h2[contains(text(),'Featured Courses')]";
	public String HOME_BUTTON="//a[contains(text(),'Home')]";
	
	By signin=By.xpath(LOGIN_LINK_CLICK);
	By Homepage_Title=By.xpath(HOME_PAGE_Title);
	By title=By.cssSelector(".text-center>h2");
	By NavBar=By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	By popup=By.xpath("//button[text()='NO THANKS']");
	By HomeButton=By.xpath(HOME_BUTTON);
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver; 
	// first driver is -> variable and 2nd driver is-> argument we are passing through homepage's method
	
	}

	
	
	public WebElement getLogin()
	{
		
		return driver.findElement(signin);
	}
	
	public WebElement getTitle()
	{
		
		return driver.findElement(Homepage_Title);
	}
	public WebElement getNavigationBar()
	{
		return driver.findElement(NavBar);
	}
	public int getPopUpSize()
	{
		return driver.findElements(popup).size();
	}
	public WebElement getPopUp()
	{
		return driver.findElement(popup);
	}
	public WebElement getHomebutton()
	{
		
		return driver.findElement(HomeButton);
	}
	
}
