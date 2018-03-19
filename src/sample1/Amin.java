package sample1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public  class Amin  
{		
	WebDriver driver;
	
	public Amin(WebDriver driver1)
{
	this.driver = driver1;
}
	
	@FindBy(how=How.XPATH, using=".//*[@id='btnAdd']")
	WebElement Add;	
	
	@FindBy(how=How.XPATH, using=".//*[@id='systemUser_userType']/option[1]")
	WebElement Userrole;	
	
	@FindBy(how=How.XPATH, using=".//*[@id='systemUser_employeeName_empName']")
	WebElement Employeename;	
	
	@FindBy(how=How.XPATH, using=".//*[@id='systemUser_userName']")
	WebElement username23;	
	
	@FindBy(how=How.XPATH, using=".//*[@id='systemUser_status']/option[1]")
	WebElement status;	
	
	@FindBy(how=How.XPATH, using=".//*[@id='systemUser_password']")
	WebElement password23;	
	
	@FindBy(how=How.XPATH, using=".//*[@id='systemUser_confirmPassword']")
	WebElement confirmpassword;	
	
	@FindBy(how=How.XPATH, using=".//*[@id='btnSave']")
	WebElement save;	
	
	public void Admin() throws InterruptedException, IOException
	{
		
		Add.click();
		Screenshot.Screenshot(driver, "Submited2 -");
		
		Thread.sleep(2000);
		Userrole.click();
		
		Employeename.sendKeys("Praveen");
		username23.sendKeys("Praveen");
		status.click();
		password23.sendKeys("praveen");
		confirmpassword.sendKeys("praveen");
		save.click();
		
		Thread.sleep(1000);
		driver.quit();
		}

}
