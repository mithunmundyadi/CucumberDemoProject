package StepDefenitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;


public class Steps {
	
	public WebDriver Driver;
	public LoginPage LP;	 	
	

@Given("^User launch the Chrome Browser successfully$")
public void user_launch_the_Chrome_Browser_successfully(){
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	Driver= new ChromeDriver();
	LP = new LoginPage(Driver); 
   
}

@When("^User keys url \"([^\"]*)\"$")
public void user_keys_url(String url){
    // Write code here that turns the phrase above into concrete actions
	Driver.get(url);
    
}

@When("^User enters the email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
public void user_enters_the_email_as_and_password_as(String Email, String Password){
    // Write code here that turns the phrase above into concrete actions
	LP.setUserName(Email);
    LP.setPassword(Password);
	
}

@When("^clicks Login button$")
public void clicks_Login_button(){
    // Write code here that turns the phrase above into concrete actions
	LP.ClickLogin();
}

@Then("^Page title should be \"([^\"]*)\"$")
public void page_title_should_be(String Title){
    // Write code here that turns the phrase above into concrete actions
	if (Driver.getPageSource().contains("Login was unsuccessful")) {
		Driver.close();
		Assert.assertTrue(false);
	}
	else
	{
		Assert.assertEquals(Title, Driver.getTitle());
	}
	
}

@When("^user clicks log out button$")
public void user_clicks_log_out_button() throws InterruptedException{
    // Write code here that turns the phrase above into concrete actions
	LP.ClickLogout();
    Thread.sleep(3000);    
}

@Then("^Close the Browser$")
public void close_the_Browser(){
    // Write code here that turns the phrase above into concrete actions
	Driver.quit();
    
}


}
