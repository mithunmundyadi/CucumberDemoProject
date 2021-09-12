package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public  WebDriver Idriver;
	
	public LoginPage(WebDriver Driver)
	{
		Idriver= Driver;
		PageFactory.initElements(Driver, this);
	}
	
	@FindBy(id="Email")
	@CacheLookup
	WebElement Username;
	
	@FindBy (id="Password")
	@CacheLookup
	WebElement Password;
	
	@FindBy (xpath= "//button[@type='submit']")
	@CacheLookup
	WebElement Login;
	
	@FindBy (linkText= "Logout")
	@CacheLookup
	WebElement Logout;
	
	public void setUserName(String UName) {
		Username.clear();
		Username.sendKeys(UName);
		
	}
	
	public void setPassword(String Pwd) {
		Password.clear();
		Password.sendKeys(Pwd);
		
	}
	
	public void ClickLogin() {
		Login.click();	
		
	}
	
	public void ClickLogout() {
		Logout.click();	
		
	}
	
	
		
}
