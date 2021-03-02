package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	public String EMAIL="//input[@id='user_email']";
	public String PWD="//input[@id='user_password']";
	public String SUBMIT="//input[@name='commit']";
	
	By EMAIL_LOGIN=By.xpath(EMAIL);
	By PASSWORD_LOGIN=By.xpath(PWD);
	By SUBMIT_LOGIN=By.xpath(SUBMIT);
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver; 
	// first driver is -> variable and 2nd driver is-> argument we are passing through homepage's method
	
	}

	public WebElement getEmail()
	{
		
		return driver.findElement(EMAIL_LOGIN);
	}
	public WebElement getPassword()
	{
		
		return driver.findElement(PASSWORD_LOGIN);
	}
	public WebElement getLogin()
	{
		
		return driver.findElement(SUBMIT_LOGIN);
	}
	
	
	
	
}
