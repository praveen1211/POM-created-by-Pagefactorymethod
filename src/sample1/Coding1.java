package sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Coding1 
{
	static WebDriver driver;

	
public static WebDriver code2(String browserName, String URL) throws InterruptedException
{
	if(browserName.equals("firefox"))
	{
		driver = new FirefoxDriver();
	}
	else
	{
		System.out.println("Please check the browser installed in the machine");
	}
	driver.manage().window().maximize();
	driver.get(URL);
	Thread.sleep(1000);
	
	return driver;
}


}