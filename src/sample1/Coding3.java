package sample1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Coding3 
{
	WebDriver driver;
	
	@Test
	public void loginchecker() throws InterruptedException, IOException
	{
		//calling browser and Url
		driver = Coding1.code2("firefox", "http://opensource.demo.orangehrmlive.com/");
		
		//creating the page object using page Factory
		Coding2 cod1 = PageFactory.initElements(driver, Coding2.class);
		
		//calling the method
		cod1.login("Admin","admin");
		
		Amin a1 = PageFactory.initElements(driver, Amin.class);
		a1.Admin();
		
		
	}
	
}
