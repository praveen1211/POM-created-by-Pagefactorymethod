package sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Coding1 
{
	static WebDriver driver;

	
public static WebDriver code2(String browserName, String URL) throws InterruptedException
{
	if(browserName.equals("firefox"))
	{
		driver = new FirefoxDriver();
	}
	else if(browserName.equals("chrome"))
	{
		System.setProperty("" , "");
		driver = new ChromeDriver();
	}
	else if(browserName.equals("ie"))
	{
		System.setProperty("" , "");
		driver = new InternetExplorerDriver();
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