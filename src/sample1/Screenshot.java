package sample1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class Screenshot
{
	 
	
	public static void Screenshot(WebDriver driver, String name ) throws IOException
	{
		try 
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File f = ts.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(f, new File("./PageFactory/screenshot"+name+".png") );
			
			System.out.println("Screenshot has been taken");
		} 
		catch (WebDriverException e)
		{
			
			e.printStackTrace();
		}
	} 
	
}


