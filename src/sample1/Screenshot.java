package sample1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

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
			
			//Date and timestamp for images 
			Date d = new Date();
            Timestamp t = new Timestamp(d.getTime());
            String timeStamp = t.toString();
            timeStamp = timeStamp.replace(' ', '_');
            timeStamp = timeStamp.replace(':', '_');
			
			FileUtils.copyFile(f, new File("./PageFactory/PageFactory"+name+"-"+timeStamp+".png") );
			
			System.out.println("Screenshot has been taken");
		} 
		catch (WebDriverException e)
		{
			
			e.printStackTrace();
		}
	} 
	
}


