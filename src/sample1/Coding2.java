package sample1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;


public class Coding2 
{
	WebDriver driver;
	
	public Coding2(WebDriver driver1)
{
	this.driver = driver1;
}

	 @FindBy(name="txtUsername")
	 WebElement username;
	 
	 @FindBy(how=How.ID, using="txtPassword")
	 WebElement password;
		
	@FindBy(how=How.XPATH, using=".//*[@id='btnLogin']")
	WebElement submit;
	
	@FindBy(how=How.XPATH, using=".//*[@id='menu_admin_viewAdminModule']/b")
	WebElement Admin;


	public void login(String username1, String password1) throws IOException
{
		
			
	username.sendKeys(username1);
	password.sendKeys(password1);
	submit.click();
	Screenshot.Screenshot(driver, "Submited");
	Admin.click();
		
}
	
}
